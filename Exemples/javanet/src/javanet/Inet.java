package javanet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet {
   public static void main(String[] args) {
      try {
         InetAddress address = InetAddress.getLocalHost();
         //address = InetAddress.getByAddress(new byte[]{(byte)192,(byte)168, 2, 44});
         //address = InetAddress.getByName("localhost");
         //address = InetAddress.getByName("127.0.0.1");
         System.out.println("Nom  : " + address.getHostName());
         System.out.println("Adresse : " + address.getHostAddress());
         System.out.println("Nom canonique : " + address.getCanonicalHostName());
         
      } catch (UnknownHostException e) {
         e.printStackTrace();
      }
   }
}