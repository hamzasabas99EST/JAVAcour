package gestionEleves;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestGroupeElevesFichier {
	public static void main(String[] arg) throws IOException {
		GroupeEleves groupe = new GroupeEleves();
		Eleve eleve;
		Scanner lecteur = new Scanner(new File(arg[0]));
		while (lecteur.hasNext()) {
			eleve = new Eleve(lecteur.next());
			while (lecteur.hasNextInt()) eleve.ajouterNote(lecteur.nextInt());
			groupe.ajouterEleve(eleve);
		}			
		lecteur.close();
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
