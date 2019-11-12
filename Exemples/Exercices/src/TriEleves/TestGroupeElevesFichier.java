package gestionEleves;

import java.io.File;
import java.io.IOException;

public class TestGroupeElevesFichier {
	public static void main(String[] arg) throws IOException {
		GroupeEleves groupe = new GroupeEleves();

		java.util.Scanner entree = new java.util.Scanner(new File(arg[0]));
		Eleve eleve;

		while(entree.hasNext()) {
			eleve = new Eleve(entree.next());
			while(entree.hasNextInt())
				eleve.ajouterNote(entree.nextInt());
			groupe.ajouterEleve(eleve);
		}

		Eleve meilleurEleve;

		meilleurEleve = groupe.meilleurEleve();
		System.out.println("Meilleur(e) eleve : " + meilleurEleve.getNom());
		groupe.trierEleves();
		System.out.println("\nListe triee");
		groupe.lister();
	}
}