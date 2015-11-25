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

import com.mia.miniprojet.mvc2java.generation.ui.controler.IOperationControler;
import com.mia.miniprojet.mvc2java.generation.ui.view.IOperationView;
import com.mia.miniprojet.mvc2java.generation.model.IOperation;

public class OperationView extends Shell implements IOperationView {
private IOperationControler controler;
private IOperation model;
public OperationView(Display display, com.mia.miniprojet.mvc2java.generation.model.IOperation model, IOperationControler controler) {
		super(display, SWT.SHELL_TRIM);
		this.model = model;
		this.controler = controler;
		
		//createContents();
	}
public void quitter(){

}

}