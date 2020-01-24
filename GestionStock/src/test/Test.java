package test;

import sn.senstock.dao.IProduit;
import sn.senstock.dao.IProduitImp;
import sn.senstock.dao.IUser;
import sn.senstock.dao.UserImp;
import sn.senstock.entities.Produit;
import sn.senstock.entities.User;

public class Test {

    public static void main(String[] args){

        IUser userdao = new UserImp();
        User u =  new User();
        u.setEmail("bj@gmail.com");
        u.setPassword("passer");
        u.setPrenom("bj");
        u.setNom("traore");
        int result = userdao.add(u);
        System.out.println("ok");
    }
}
