package gestionEleve;

import java.util.ArrayList;

public class GroupeEleves {
	private ArrayList<Eleve> listEleves;
	public void ajoutEleve(Eleve e) {
		if(this.listEleves==null) this.listEleves=new ArrayList<Eleve>();
		listEleves.add(e);
	}
	public ArrayList<Eleve> getListe(){
		return this.listEleves;
	}
	public int getNombre() {
		return this.listEleves.size();
	}
	public Eleve cherche(String nom) {
		for(Eleve e: this.listEleves) 
			if (e.getNom().equals(nom))return e;
		return null;
	}
	public void lister() {
		for(Eleve e: this.listEleves) 
			System.out.println(e);
		
	}
}
