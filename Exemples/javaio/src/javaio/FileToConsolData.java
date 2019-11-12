package javaio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileToConsolData {
	public static void main(String[] args) {
		DataInputStream dis;
	    DataOutputStream dos;
	    try {
	      dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("data.txt"))));
	      dos.writeByte(100);
	      dos.writeChar('C');
	      dos.writeDouble(12.05);
	      dos.writeFloat(34.5f);
	      dos.writeInt(1748);
	      dos.close();
	      
	      dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("data.txt"))));
	      
	      System.out.println(dis.readByte());
	      System.out.println(dis.readChar());
	      System.out.println(dis.readDouble());
	      System.out.println(dis.readFloat());
	      System.out.println(dis.readInt());
	      
	      dis.close();
	    } catch (FileNotFoundException e) {e.printStackTrace();}
	    catch (IOException e) {e.printStackTrace();}       
	}
}

