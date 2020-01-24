package sn.senstock.dao;

import sn.senstock.entities.Produit;

import java.util.List;

public interface IProduit {

    public int add(Produit p);
    public int update(Produit p);
    public int delete(int id);
    public Produit get(int id);
    public List<Produit> getAll();
}
