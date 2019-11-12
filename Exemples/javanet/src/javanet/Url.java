package javanet;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Url {
   public static void main(String[] args) {
      try {
         URL url = new URL("http://www.este.ucam.ac.ma/");
         System.out.println("Authority : " + url.getAuthority());
         System.out.println("Default port : " + url.getDefaultPort());
         System.out.println("Host : " + url.getHost());
         System.out.println("Port : " + url.getPort());
         System.out.println("Protocol : " + url.getProtocol());
      } catch (MalformedURLException e) {e.printStackTrace();}
   }
}

