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
private Button btnafficherClient;
private Button btnquitter;

public List ClientList;

public BanqueView(Display display, com.mia.miniprojet.mvc2java.generation.model.IBanque model, IBanqueControler controler) {
		super(display, SWT.SHELL_TRIM);
		this.model = model;
		this.controler = controler;
		
		createContents();
	}
public void afficherClient(){
	this.controler.afficherClient();
}
public void quitter(){
	this.controler.quitter();
}

private void createContents(){
		setText("Vue Banque");
		setSize(458, 308);
		setLayout(new GridLayout(2, false));

		
		// Liste
Group grpClient = new Group(this, SWT.NONE);
grpClient.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
grpClient.setText("Liste des Client");
grpClient.setLayout(new GridLayout());

this.ClientList = new List(grpClient, SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE);
this.ClientList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
for (final com.mia.miniprojet.mvc2java.generation.model.IClient elt : this.model.getClients()) {
	this.ClientList.add(elt.toString());
}
		
		Group grpButtons = new Group(this, SWT.NONE);
		grpButtons.setLayout(new GridLayout(2, false));
		grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		btnafficherClient = new Button(grpButtons, SWT.NONE);
btnafficherClient.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
btnafficherClient.setText("afficherClient");
btnafficherClient.addSelectionListener(new SelectionAdapter(){
	public void widgetSelected(SelectionEvent event){
			afficherClient();
	}
});
btnquitter = new Button(grpButtons, SWT.NONE);
btnquitter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
btnquitter.setText("quitter");
btnquitter.addSelectionListener(new SelectionAdapter(){
	public void widgetSelected(SelectionEvent event){
			quitter();
	}
});

}
}