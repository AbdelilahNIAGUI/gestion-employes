package com.gestionemployes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employe {
	
	@Id @GeneratedValue
	private int id;
	private String nom;
	private String prenom;
	private String departement;
	private int numPoste;
	
	public Employe() {
		super();
	}

	public Employe(String nom, String prenom, String departement, int numPoste) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.departement = departement;
		this.numPoste = numPoste;
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

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public int getNumPoste() {
		return numPoste;
	}

	public void setNumPoste(int numPoste) {
		this.numPoste = numPoste;
	}
	
	

}
