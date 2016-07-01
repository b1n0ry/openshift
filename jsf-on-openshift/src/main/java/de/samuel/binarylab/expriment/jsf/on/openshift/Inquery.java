package de.samuel.binarylab.expriment.jsf.on.openshift;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Inquery {
	
	private String name;
	
	//constructor
	public Inquery() { 
	}

	public String getName() {
		return name;
	}

	public void setName(String username) {
		this.name = username;
	}
	
	
}
