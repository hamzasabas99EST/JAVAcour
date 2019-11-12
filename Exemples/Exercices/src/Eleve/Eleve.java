package gestionEleves;

import java.util.ArrayList;

public class Eleve {
    private String nom;
    private ArrayList<Integer> listeNotes = new ArrayList<Integer>();
    private double moyenne;
    
    public Eleve(String nom) {
	this.nom = nom;
    }
    
    public double getMoyenne() {
	return moyenne;
    }
    
    public String getNom() {
	return nom;
    }

    public ArrayList<Integer> getListeNotes() {
	return listeNotes;
    }
    
    /* Une note inferieure a 0 sera considere comme egale a 0 ;
       une note superieure a 20 sera considere comme egale a 20 */
    public void ajouterNote(int note) {
	int nbNotes = this.listeNotes.size();
	if (note < 0) note = 0;
	else if (note > 20) note = 20;
	this.moyenne = (this.moyenne * nbNotes + note) / (nbNotes + 1);
	listeNotes.add(note);
    }
    
    public String toString() {
	return nom + " (" + (int)(100 * moyenne)/100.0 + ")";
    }
}

