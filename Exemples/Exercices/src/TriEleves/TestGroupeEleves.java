package gestionEleves;

public class TestGroupeEleves {
	public static void main(String[] arg) {
		GroupeEleves groupe = new GroupeEleves();	
		Eleve eleve, meilleurEleve;

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

		meilleurEleve = groupe.meilleurEleve();
		System.out.println("Meilleur(e) eleve : " + meilleurEleve.getNom());
		groupe.trierEleves();
		System.out.println("\nOn trie la liste");
		groupe.lister();
	}
}