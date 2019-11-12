package javaio;

import java.io.File;

public class Fichier {
  public static void main(String[] args) {
    File f = new File("fichier.txt");
    System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
    System.out.println("Est-ce qu'il existe ? " + f.exists());
    System.out.println("Est-ce un répertoire ? " + f.isDirectory());
    System.out.println("Affichage des lecteurs à la racine du PC : ");
    for(File file : File.listRoots()){
      System.out.println(file.getAbsolutePath());
      try {
        int i = 1;  
        for(File nom : file.listFiles()){
        	System.out.print("\t\t" + ((nom.isDirectory()) ? nom.getName()+"/" : nom.getName()));
        	if((i%5) == 0){
        		System.out.print("\n");
        	}
        	i++;
        }
        System.out.println("\n");
      } catch (NullPointerException e) {}
    }       
  }
}
