package edu.upc.eetac.dsa.csanchez.Tcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class Server {
	
	public static void main(String args[]) throws Exception{
		
		int puerto = 12345;
		if (args.length == 0 || args==null) {
			System.out.println("El puerto no se ha especificado, se usara el puerto por defecto: 12345");
		 }
		else if (args.length ==1 || args[0].equals("p")) {
			puerto = Integer.parseInt(args[0]);
			 System.out.println("Vamos a usar el puerto: "+puerto);
			 }	
		
	SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	ServerSocket socketAtendido =  new ServerSocket(puerto);

	 while (true) {
	 Socket socketConexion = null;
	 try {
	 socketConexion = socketAtendido.accept();
	 } catch (IOException e)
	 {
	 System.out.println("No se ha podido crear el nuevo socket");
	 }
	 PrintWriter escribir = new  PrintWriter(socketConexion.getOutputStream());
	 escribir.println(fecha.format(System.currentTimeMillis()));
	 escribir.flush();
	}
  }
	
	

}
