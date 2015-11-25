package com.mia.miniprojet.mvc2java.generation.model.impl;

import java.util.List;
import java.util.ArrayList;

public class Client implements com.mia.miniprojet.mvc2java.generation.model.IClient {
private String Nom;
private String Prenom;
private String Adresse;

private List<com.mia.miniprojet.mvc2java.generation.model.ICompte> listCompte;

public String getNom(){
	return this.Nom;
}

public void setNom(String newValue){
	this.Nom=newValue;
}
public String getPrenom(){
	return this.Prenom;
}

public void setPrenom(String newValue){
	this.Prenom=newValue;
}
public String getAdresse(){
	return this.Adresse;
}

public void setAdresse(String newValue){
	this.Adresse=newValue;
}

public List<com.mia.miniprojet.mvc2java.generation.model.ICompte> getComptes() {
		if (this.listCompte == null) {
			this.listCompte = new ArrayList<com.mia.miniprojet.mvc2java.generation.model.ICompte>();
		}
		return this.listCompte;
}
	
public void setComptes(List<com.mia.miniprojet.mvc2java.generation.model.ICompte> newValue) {
		this.listCompte = newValue;
}
}