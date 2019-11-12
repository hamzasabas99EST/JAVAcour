package javanet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class ClientChat {
	public static void main(String[] args) {
		Socket soc;
		BufferedReader in=null;
		//PrintWriter out=null;
		try {
			soc = new Socket(InetAddress.getLocalHost(),4040);	
		    System.out.println("Demande de connexion");
	        in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
	        String msg= in.readLine();
	        System.out.println(msg);
	        soc.close();
		}catch (UnknownHostException e) {e.printStackTrace();}
		catch (IOException e) {e.printStackTrace();}
	}
}
