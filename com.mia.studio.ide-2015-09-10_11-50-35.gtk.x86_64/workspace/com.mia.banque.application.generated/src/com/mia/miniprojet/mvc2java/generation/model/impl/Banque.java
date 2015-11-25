package com.mia.miniprojet.mvc2java.generation.model.impl;

import java.util.List;
import java.util.ArrayList;

public class Banque implements com.mia.miniprojet.mvc2java.generation.model.IBanque {

private List<com.mia.miniprojet.mvc2java.generation.model.IClient> listClient;


public List<com.mia.miniprojet.mvc2java.generation.model.IClient> getClients() {
		if (this.listClient == null) {
			this.listClient = new ArrayList<com.mia.miniprojet.mvc2java.generation.model.IClient>();
		}
		return this.listClient;
}
	
public void setClients(List<com.mia.miniprojet.mvc2java.generation.model.IClient> newValue) {
		this.listClient = newValue;
}
}