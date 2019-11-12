package javaio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCPbis {
	 public static void main(String[] args) {
	    FileInputStream fis = null;
	    FileOutputStream fos = null;
	    BufferedInputStream bis=null;
	    BufferedOutputStream bos=null; 
	    File f = new File("fichier.txt");
	    try {
	       fis = new FileInputStream(f);
	       fos = new FileOutputStream(new File("fichierCp.txt"));
	       bis = new BufferedInputStream(new FileInputStream(new File("fichier.txt")));
	       bos = new BufferedOutputStream(new FileOutputStream(new File("fichierCp1.txt")));
	       byte[] buf = new byte[8];
	       int n = 0;
	       long start = System.currentTimeMillis();
	       while (fis.read(buf) >= 0) {
	          fos.write(buf);
	       }
	       System.out.println("Copie terminée dans: "+(System.currentTimeMillis()-start)+"ms");
	       
	       start = System.currentTimeMillis();
	       while (bis.read(buf) >= 0) {
	          bos.write(buf);
	       }
	       System.out.println("Copie terminée dans: "+(System.currentTimeMillis()-start)+"ms");
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

