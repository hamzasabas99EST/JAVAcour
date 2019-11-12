package javanet;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestSocket {

   public static void main(String[] args) {
	   Socket soc=null;
      try {
         soc = new Socket(InetAddress.getByName("www.google.com"), 80);
         //Socket soc = new Socket("www.google.com", 80);
      } catch (UnknownHostException e) {e.printStackTrace();}
      catch (IOException e) {e.printStackTrace();}
      finally{
          if(soc != null){
             try {
                soc.close();
             } catch (IOException e) {
                e.printStackTrace();
                soc = null;
             }
          }
       }
   }
}

