package gestionEleve;

import java.util.Collections;

public class TestEleve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eleve e1=new Eleve("Yasmine");
		
		GroupeEleves g=new GroupeEleves();
		e1.ajouterNote(12);
		e1.ajouterNote(10);
		g.ajoutEleve(e1);
		
		e1=new Eleve("Yaine");
		e1.ajouterNote(12);
		e1.ajouterNote(16);
		g.ajoutEleve(e1);
		
		e1=new Eleve("Yasmi");
		e1.ajouterNote(12);
		g.ajoutEleve(e1);
	
		e1=new Eleve("mine");
		g.ajoutEleve(e1);
		System.out.println(g.cherche("Yasiymi"));
		System.out.println();
		g.lister();
		
		System.out.println(g.getListe().get(0).compareTo(g.getListe().get(1)));
		Collections.sort(g.getListe());
		System.out.println(g.getListe());
		System.out.println(Collections.max(g.getListe()));

	}

}
