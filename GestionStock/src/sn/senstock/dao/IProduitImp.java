package sn.senstock.dao;

import sn.senstock.entities.Produit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class IProduitImp  implements IProduit{

    EntityManager em ;
    public IProduitImp() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionStock");
        em = emf.createEntityManager();
    }
    @Override
    public int add(Produit p) {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update(Produit p) {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
            return 1;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int delete(int id) {
        try {
            em.getTransaction().begin();
            em.remove(em.find(Produit.class, id));;
            em.getTransaction().commit();
            return 1;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public Produit get(int id) {
            return (Produit)em.createNamedQuery("Produit.findById")
                    .setParameter("id", id)
                    .getSingleResult();
    }

    @Override
    public List<Produit> getAll() {
        return em.createQuery("SELECT u FROM Produit u").getResultList();
    }
}
