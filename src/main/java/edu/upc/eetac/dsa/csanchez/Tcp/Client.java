package edu.upc.eetac.dsa.csanchez.Tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;



public class Client {
	
	public static void main(String args[]) throws UnknownHostException, IOException {
	
		int puerto = 12345;
		
		if (args.length == 0 || args == null) {
			 System.exit(0);
			 } else if (args.length < 5) {
			 // ERROR SIEMPRE: EL NUMERO DE ARGUMENTOS OBLIGATORIOS ES 5
			 System.exit(0);
			 
			 puerto = Integer.parseInt(args[1]);
			 System.out.println("Vamos a usar el puerto:" + puerto);
			 }
		
		Socket socketCliente = null;
	
		socketCliente = new Socket("localhost", puerto);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
	    String data = reader.readLine();
	    System.out.println(data);
	}

}
