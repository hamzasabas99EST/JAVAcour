package javanet;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class FreePort {
	public static void main(String[] args) {
		System.out.println("Liste des port ouvert:");
		Socket soc=null;
		for(int i = 1; i <= 65535; i++){
	         try {
	             soc = new Socket("127.0.0.1", i);
	             System.out.println(i);
	         } catch (UnknownHostException e) {e.printStackTrace();}
	         catch (IOException e) {}
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
}

