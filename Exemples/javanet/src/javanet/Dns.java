package javanet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Dns {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Saisissez une adresse(IPv4 ou nom de domaine): ");
      String hote = sc.nextLine();
      System.out.println("Voici le résultat trouvé : ");
      String result = "";
      try {
         if(hote.matches("[a-zA-Z\\.]+"))
            result = InetAddress.getByName(hote).getHostAddress();
         else
            result = InetAddress.getByName(hote).getHostName();  
         System.out.println(result);
      } catch (UnknownHostException e) {e.printStackTrace();}  
      
   }
}

