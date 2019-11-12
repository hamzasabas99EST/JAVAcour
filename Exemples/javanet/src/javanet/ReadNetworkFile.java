package javanet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadNetworkFile {
	public static void main(String[] args) {
	      
	         try {
				URL url=new URL("http://www.google.com");
				InputStream is=url.openStream();
				 BufferedInputStream bis=new BufferedInputStream(is);
				 StringBuilder sb=new StringBuilder();
				 int n;
				 while((n=bis.read())!=-1) sb.append((char)n);
				 System.out.println(sb);
			} catch (MalformedURLException e) {e.printStackTrace();}
	         catch (IOException e) {e.printStackTrace();}	      
	   }
	}


