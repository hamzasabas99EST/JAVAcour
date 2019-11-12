package gestionEleve;

import java.util.ArrayList;

public class Eleve implements Comparable<Eleve>{
	private ArrayList<Integer> notes;
	private String nom;
	private double moyenne;
	public Eleve(String nom) {
		this.nom=nom;
		this.moyenne=0;
		this.notes=new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> getNotes(){
		return notes;
	}
	public String getNom() {
		return nom;
	}
	public double getMoyenne() {
		return moyenne;
	}
	public void ajouterNote(int n) {
		if (n<0) n=0;
		else if (n>20) n=20;
		this.moyenne=(this.moyenne* notes.size()+n)/(notes.size()+1);
		notes.add(n);
	}
	
	public String toString() {
		return this.nom+":"+this.notes+ "--> "+ this.moyenne;
	}

	@Override
	public int compareTo(Eleve o) {
		int dif=(int)(this.getMoyenne()-o.getMoyenne());
		if(dif==0)		return this.getNom().compareTo(o.getNom());
		else return dif;
	}
	

}







