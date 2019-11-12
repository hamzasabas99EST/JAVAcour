package javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCP {
	 public static void main(String[] args) {
	    FileInputStream fis = null;
	    FileOutputStream fos = null;
	    File f = new File("fichier.txt");
	    try {
	       fis = new FileInputStream(f);
	       fos = new FileOutputStream(new File("fichierCp.txt"));
	       byte[] buf = new byte[8];
	       int n = 0;
	       while ((n = fis.read(buf)) >= 0) {
	          for(int i=0;i<n;i++) fos.write(buf[i]);
	       }
	       System.out.println("Copie terminée !");
	    }
	    catch (FileNotFoundException e) {e.printStackTrace();}
	    catch (IOException e) {e.printStackTrace();} 
	    finally {
	    	try {
	    		if (fis != null) fis.close();
	    	} catch (IOException e) {e.printStackTrace();}
	    	try {
	    		if (fos != null)fos.close();
	    	} catch (IOException e) {e.printStackTrace();}
	    }
	 }
}

