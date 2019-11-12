package javanet;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketTest {
	public static void main(String[] args) {
		for(int port = 1; port <= 65535; port++){
	         try {
	            ServerSocket sSoc = new ServerSocket(port);
	            System.out.println("Le port " + port + " est libre ");
	         } catch (IOException e) {
	            //port déjà utilisé 
	         }
	    }
	}
}




