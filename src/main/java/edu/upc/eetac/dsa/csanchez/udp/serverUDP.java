package edu.upc.eetac.dsa.csanchez.udp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class serverUDP {

public static void main(String args[]) throws Exception{
		
		int puerto = 12345;
		if (args.length == 0 || args==null) {
		System.out.println("El puerto no se ha especificado, se usara el puerto por defecto: 12345");
		 }
		else if (args.length == 1 || args[0].equals("p")) {
			puerto = Integer.parseInt(args[0]);
			 System.out.println("Vamos a usar el puerto: "+puerto);
			 }	
		SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		DatagramSocket socket = new DatagramSocket(puerto);
		
		 while (true) {
			 byte[] buffer = new byte[0];
			 DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
			 socket.receive(datagramPacket);
			 ByteArrayOutputStream baos = new ByteArrayOutputStream();
	         DataOutputStream dos = new DataOutputStream(baos);
	         dos.writeUTF(fecha.format(System.currentTimeMillis()));
	         byte[] data = baos.toByteArray();
	         
	         datagramPacket = new DatagramPacket(data, data.length, datagramPacket.getAddress(), datagramPacket.getPort());
	         socket.send(datagramPacket);
			}
		  }
		
}