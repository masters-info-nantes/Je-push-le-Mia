package com.mia.formation.generation.ui;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.SWT;

public class BanqueView extends Shell {

	private Button btnafficherClient;
	private Button btnafficherCompte;
	private Button btnquitter;


	public void afficherClient (){
	// Start of user code for afficherClient
// End of user code
	}
	public void afficherCompte (){
	// Start of user code for afficherCompte
// End of user code
	}
	public void quitter (){
	// Start of user code for quitter
// End of user code
	}


	/**
	 * Create the shell.
	 * @param display
	 */
	public BanqueView(Display display) {
		super(display, SWT.SHELL_TRIM);
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("BanqueView");
		setSize(450, 300);
	}
}