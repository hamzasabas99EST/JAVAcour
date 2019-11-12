package javanet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
public static void main(String[] args) {
        ServerSocket sSoc=null;
        Socket soc=null ;
        BufferedReader in=null;
        PrintWriter out=null;
        try {
            sSoc = new ServerSocket(4040);
            System.out.println("Le serveur est à l'écoute du port "+sSoc.getLocalPort());
            soc = sSoc.accept(); 
            System.out.println("Un client s'est connecté");
            out = new PrintWriter(soc.getOutputStream());
            out.println("Bonjour !");
            out.flush();
            soc.close();
            sSoc.close();
        }catch (IOException e) {e.printStackTrace();}
    }
}
