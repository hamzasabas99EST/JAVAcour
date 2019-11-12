package gestionEleves;

import java.util.ArrayList;
import java.util.Collections;

public class GroupeEleves {

	private ArrayList<Eleve> listeEleves = new ArrayList<Eleve>();

	public GroupeEleves() {
	}

	public int nombre() {
		return listeEleves.size();
	}

	public void ajouterEleve(Eleve eleve) {
		listeEleves.add(eleve);
	}

	public Eleve chercher(String nom) {
		for (Eleve eleve : listeEleves) 
			if (eleve.getNom().equals(nom)) return eleve;
		return null;
	}

	public void lister() {
		for (Eleve eleve : listeEleves) {
			System.out.println(eleve);
		}
	}

	public Eleve meilleurEleve() {
		return Collections.max(listeEleves);
	}

	public void trierEleves() {
		Collections.sort();
	}
}