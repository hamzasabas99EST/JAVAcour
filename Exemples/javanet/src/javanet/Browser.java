package javanet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Browser {
 public static void main(String[] args) {
  try {
     String siteWeb = "http://www.google.com";
     URL url = new URL(siteWeb);
     System.out.println("Authority : " + url.getAuthority());
     System.out.println("Default port : " + url.getDefaultPort());
     System.out.println("Host : " + url.getHost());
     System.out.println("Port : " + url.getPort());
     System.out.println("Protocol : " + url.getProtocol());
     try {
        URLConnection urlConn = url.openConnection();
        System.out.println(urlConn.getContentType());
        String content = "", line = null;
        BufferedReader buf = new BufferedReader(
        		new InputStreamReader(urlConn.getInputStream()));
        while((line = buf.readLine()) != null) content += line + "\n";
        System.out.println(content);
     } catch (IOException e) {e.printStackTrace();}
  } catch (MalformedURLException e) {e.printStackTrace();}
 }
}   
