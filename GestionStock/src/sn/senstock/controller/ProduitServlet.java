package sn.senstock.controller;


import sn.senstock.dao.IProduit;
import sn.senstock.dao.IProduitImp;
import sn.senstock.entities.Produit;
import sn.senstock.entities.User;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Produit" , name="produit")
public class ProduitServlet extends HttpServlet {
    private IProduit produitdao;

    public void init(ServletConfig config) throws ServletException {
        produitdao = new IProduitImp();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("user_session") != null ) {
            if(request.getParameter("page")!=null) {
                String page = request.getParameter("page").toString();
                if(page.equals("edit")) {
                    int id = Integer.parseInt(request.getParameter("id").toString());
                    produitdao.get(id);
                    request.getRequestDispatcher("view/liste/edit.jsp").forward(request, response);

                }

                if(page.equals("delete")) {
                    if(request.getParameter("id")!=null){
                        int id = Integer.parseInt(request.getParameter("id").toString());
                        produitdao.delete(id);
                    }

                }

            }

            request.setAttribute("liste_produit", produitdao.getAll());

            request.getRequestDispatcher("view/produit/liste.jsp").forward(request, response);
        }
        else {
            response.sendRedirect("Login");
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("valider") !=null) {
            String nom = request.getParameter("nom").toString();
            double qt = Double.parseDouble(request.getParameter("qtStock").toString());
            Produit p = new Produit();
            p.setNom(nom);
            p.setQtStock(qt);
            User user  = (User) request.getSession().getAttribute("user_session");
            p.setUser(user);
            int result = produitdao.add(p);

            if(result != 0) {
                request.setAttribute("message", "Données ajoutées avec succées");
            }else {
                request.setAttribute("message", "Données non ajoutées");
            }
        }
        doGet(request,response);

    }

}
