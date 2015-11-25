package com.mia.miniprojet.mvc2java.generation.model.impl;

import java.util.List;
import java.util.ArrayList;

public class Operation implements com.mia.miniprojet.mvc2java.generation.model.IOperation {
private String Numero;
private String Montant;


public String getNumero(){
	return this.Numero;
}

public void setNumero(String newValue){
	this.Numero=newValue;
}
public String getMontant(){
	return this.Montant;
}

public void setMontant(String newValue){
	this.Montant=newValue;
}


}