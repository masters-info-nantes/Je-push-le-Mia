package com.mia.miniprojet.mvc2java.generation.ui.view.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Group;

import com.mia.miniprojet.mvc2java.generation.ui.controler.IBanqueControler;
import com.mia.miniprojet.mvc2java.generation.ui.view.IBanqueView;
import com.mia.miniprojet.mvc2java.generation.model.IBanque;

public class BanqueView extends Shell implements IBanqueView {
private IBanqueControler controler;
private IBanque model;
public BanqueView(Display display, com.mia.miniprojet.mvc2java.generation.model.IBanque model, IBanqueControler controler) {
		super(display, SWT.SHELL_TRIM);
		this.model = model;
		this.controler = controler;
		
		//createContents();
	}
public void afficherClient(){

}
public void quitter(){

}

}