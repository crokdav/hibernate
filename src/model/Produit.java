package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.Transient;

@Entity
public class Produit {
@Id
@GeneratedValue
private int id;
@Column(name="n_produit")
private String NomProduit;
//@Transient
private String description;
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public Produit(int id, String nomProduit, String decroiption) {
	super();
	this.id = id;
	NomProduit = nomProduit;
	this.description = decroiption;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNomProduit() {
	return NomProduit;
}
public void setNomProduit(String nomProduit) {
	NomProduit = nomProduit;
}
public String getDescription() {
	return description;
}
public void setDescription( String description) {
	this.description = description;
}
	
	
	
}