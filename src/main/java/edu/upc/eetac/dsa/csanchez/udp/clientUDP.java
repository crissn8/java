package edu.upc.eetac.dsa.csanchez.udp;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class clientUDP {


	    public static void main(String[] args) throws IOException {
	        if (args.length < 2) {
	            System.err.println("Tienes que indicar el nombre del servidor y su puerto");
	            System.exit(-1);
	        }
	        String server = args[0];
	        int port = Integer.parseInt(args[1]);
	
	        byte[] buffer = new byte[0];
	        
	        
	        DatagramPacket dp = new DatagramPacket(buffer, buffer.length, InetAddress.getByName(server), port);
	        DatagramSocket dSocket = new DatagramSocket();
	        dSocket.send(dp);

	        byte[] buffer2 = new byte[1496];
	        dp = new DatagramPacket(buffer, buffer.length);
	        dSocket.receive(dp);
	        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(dp.getData()));
	        String time = dis.readUTF();
	        System.out.println(time);
	    }
}
