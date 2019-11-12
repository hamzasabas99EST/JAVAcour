package javanet;

import java.io.IOException;
import java.net.*;

public class ServerChatMulti {
	public static void main(String[] args){
		ServerSocket soc;
		try {
			soc = new ServerSocket(4040);
			Thread t = new Thread(new AcceptClts(soc));
			t.start();
			System.out.println("Ready!");
		} catch (IOException e) {e.printStackTrace();}
	}
}

class AcceptClts implements Runnable {
   private ServerSocket sSoc;
   private Socket soc;
   private int nbrclient = 1;
	public AcceptClts(ServerSocket s){
		sSoc = s;
	}
	public void run() {
        try {
        	while(true){
        		soc = sSoc.accept(); // Un client se connecte on l'accepte
                System.out.println("Le client numéro "+nbrclient+ " est connecté !");
                nbrclient++;
                soc.close();
        	}
        } catch (IOException e) {e.printStackTrace();}
	}
}
