package javaio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileToConsolObj {
	public static void main(String[] args) {
		ObjectInputStream ois;
		ObjectOutputStream oos;
	    try {
	    	oos = new ObjectOutputStream(new BufferedOutputStream(
	    			new FileOutputStream(
	    					new File("game.txt"))));
	    	oos.writeObject(new Game("Assassin Creed", "Aventure", 45.69));
	    	oos.writeObject(new Game("Tomb Raider", "Plateforme", 23.45));
	    	oos.writeObject(new Game("Tetris", "Stratégie", 2.50));
	    	oos.close();
	    	FileInputStream fis =new FileInputStream(new File("game.txt"));
	    	ois = new ObjectInputStream(fis);
	    	try {
	    		Game g;
	    		while(fis.available()>0) {
	    			g=(Game)ois.readObject();
	    			System.out.println(g);
	    		}
	    	} catch (ClassNotFoundException e) {e.printStackTrace();}
	    	ois.close();
	    } catch (FileNotFoundException e) {e.printStackTrace();}
	    	catch (IOException e) {e.printStackTrace();}       
	}
}

