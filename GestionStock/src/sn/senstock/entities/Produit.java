package sn.senstock.entities;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
        , @NamedQuery(name = "Produit.findById", query = "SELECT u FROM User u WHERE u.id =:id")
})
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private  double qtStock;
    @ManyToOne
    private User user  = new User();

    public Produit() {
    }

    public Produit(String nom, double qtStock, User user) {
        this.nom = nom;
        this.qtStock = qtStock;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getQtStock() {
        return qtStock;
    }

    public void setQtStock(double qtStock) {
        this.qtStock = qtStock;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
