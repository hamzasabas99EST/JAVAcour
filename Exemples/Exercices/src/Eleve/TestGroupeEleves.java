package gestionEleves;

import java.io.File;
import java.io.IOException;
import gestionEleves.Eleve;
import gestionEleves.GroupeEleves;

public class TestGroupeEleves {
	public static void main(String[] arg) {
		Eleve eleve;
		GroupeEleves groupe = new GroupeEleves();

		eleve = new Eleve("Marie");
		eleve.ajouterNote(12);
		eleve.ajouterNote(17);
		groupe.ajouterEleve(eleve);
		eleve = new Eleve("Sophie");
		eleve.ajouterNote(15);
		eleve.ajouterNote(9);
		groupe.ajouterEleve(eleve);
		eleve = new Eleve("Lisa");
		eleve.ajouterNote(16);
		groupe.ajouterEleve(eleve);
		groupe.lister();
		eleve = groupe.chercher("Laurent");
		if (eleve != null) 
			System.out.println("Voila Laurent :  " + groupe.chercher("Laurent"));
		else System.out.println("Laurent n'est pas dans la liste");
		eleve = groupe.chercher("Marie");
		if (eleve != null) 
			System.out.println("Voila Marie : " +  groupe.chercher("Marie"));
		else System.out.println("Marie n'est pas dans la liste");
	}
}
