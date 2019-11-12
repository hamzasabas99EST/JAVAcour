package gestionEleves;

class TestEleve {
	public static void compare(Eleve eleve1, Eleve eleve2) {
		int comparaison = eleve1.compareTo(eleve2);
		if (comparaison > 0) 
			System.out.println(eleve1.getNom() + " est meilleur(e) que " +
					eleve2.getNom());
		else  if  (comparaison ==  0) 
			System.out.println(eleve1.getNom() + " et " + eleve2.getNom()  + "  sont a egalite"); 
		else System.out.println(eleve2.getNom() + " est meilleur(e) que "  + eleve1.getNom());
	}
	
	public static void main(String[] arg) {
		Eleve eleve = new Eleve("Marie");
		eleve.ajouterNote(12);
		System.out.println(eleve.getNom() + 
				" a pour moyenne " + eleve.getMoyenne());
		Eleve autreEleve = new Eleve("Sophie");
		autreEleve.ajouterNote(11);
		autreEleve.ajouterNote(13);
		
		compare(eleve,  autreEleve);
		
		eleve.ajouterNote(6);
		compare(eleve,  autreEleve);
		
		eleve.ajouterNote(19);
		compare(eleve,  autreEleve);
	}
}