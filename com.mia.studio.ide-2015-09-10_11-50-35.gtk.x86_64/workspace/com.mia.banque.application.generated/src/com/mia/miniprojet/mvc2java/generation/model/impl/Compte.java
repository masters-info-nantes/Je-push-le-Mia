package com.mia.miniprojet.mvc2java.generation.model.impl;

import java.util.List;
import java.util.ArrayList;

public class Compte implements com.mia.miniprojet.mvc2java.generation.model.ICompte {
private String Numero;

private List<com.mia.miniprojet.mvc2java.generation.model.IOperation> listOperation;

public String getNumero(){
	return this.Numero;
}

public void setNumero(String newValue){
	this.Numero=newValue;
}

public List<com.mia.miniprojet.mvc2java.generation.model.IOperation> getOperations() {
		if (this.listOperation == null) {
			this.listOperation = new ArrayList<com.mia.miniprojet.mvc2java.generation.model.IOperation>();
		}
		return this.listOperation;
}
	
public void setOperations(List<com.mia.miniprojet.mvc2java.generation.model.IOperation> newValue) {
		this.listOperation = newValue;
}
}