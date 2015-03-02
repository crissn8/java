package edu.upc.eetac.dsa.csanchez.Sincronismo;

public class App {
	
	public static void main (String[] args){
		
		String frase= "hola hola como vaaaa.\n";
		Buffer buffer = new Buffer();
		Thread Productor = new Thread(new Productor(frase, buffer), "productor");
	    Thread Leer = new Thread(new Leer(buffer), "consumer");
		
	    Productor.start();
	    Leer.start();
	}

}
