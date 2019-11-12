package javanet;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {
	public static void main(String[] args) {
		Socket soc=null;
		try {
		     soc = new Socket(InetAddress.getLocalHost(),4040);	
	         soc.close();
		}catch (UnknownHostException e) {e.printStackTrace();}
		catch (IOException e) {e.printStackTrace();}
	}
}
