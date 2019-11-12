package javaio;

import java.io.Serializable;


public class Game implements Serializable{
	private String nom, style;
	private double prix;
	private transient Gtype type;
	public Game(String nom, String style, double prix) {
	    this.nom = nom;
	    this.style = style;
	    this.prix = prix;
	    type=new Gtype(10);
	}
	public String toString(){
		return "Nom du jeu : " + this.nom + "\n Style de jeu : " + 
				this.style + "\n Prix du jeu : " + this.prix + "\n";
	} 
}

