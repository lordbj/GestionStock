package sn.senstock.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
    , @NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id =:id")
    , @NamedQuery(name = "User.findByNom", query = "SELECT u FROM User u WHERE u.nom = :nom")
    , @NamedQuery(name = "User.findByPrenom", query = "SELECT u FROM User u WHERE u.prenom = :prenom")
    , @NamedQuery(name = "User.findByEmail", query = "SELECT u FROM User u WHERE u.email = :email")
    , @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password")
    ,@NamedQuery(name="User.findByEmailAndfindByPassword",query="SELECT u FROM User u WHERE u.email=:email AND u.password=:password")
})

public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id ;
	@Column(length=200)
	private String nom;
	@Column(length=255)
	private String prenom;
	@Column(length=150)
	private String email;
	@Column(length=150)
	private String password;
	@OneToMany(mappedBy="user")
	private List<Produit> produits = new ArrayList<Produit>();

	
	public User() {
		super();
	}

	public User(String nom, String prenom, String email, String password, List<Produit> produits) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.produits = produits;
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
}
