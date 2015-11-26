package com.mia.miniprojet.mvc2java.generation.ui.controler.swt;

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

import com.mia.miniprojet.mvc2java.generation.ui.controler.IClientControler;
import com.mia.miniprojet.mvc2java.generation.ui.view.IClientView;
import com.mia.miniprojet.mvc2java.generation.ui.view.swt.ClientView;
import com.mia.miniprojet.mvc2java.generation.model.IClient;

public class ClientControler implements IClientControler {
	private ClientView view;
	private IClient model;
public ClientControler(com.mia.miniprojet.mvc2java.generation.model.IClient model) {
		this.model = model;
	}
public void initView() {
	Display display = Display.getDefault();
	
	this.view = new ClientView(display, this.model, this);
	this.view.open();
	this.view.layout();
	
	while (!this.view.isDisposed()) {
		if (!display.readAndDispatch()) {
			display.sleep();
		}
	}
}

public void afficherCompte(){
// Start of user code of method afficherCompte

// End of user code of method afficherCompte
}public void quitter(){
// Start of user code of method quitter

// End of user code of method quitter
}
}