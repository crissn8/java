package edu.upc.eetac.dsa.csanchez.Sincronismo;

public class Leer implements Runnable{

	
	private Buffer buffer = null;
	
	
	public Leer (Buffer buffer){
		this.buffer=buffer;
	}
	
	 public void run() {
		 
		 StringBuilder sb = new StringBuilder();
	     char x;
	     
	     while ((x = buffer.get()) != '\n'){
	    	 System.out.println("Hola, muy buenos días " + x);
	           sb.append(x);
	    	 
	     }
	 }
	
}
