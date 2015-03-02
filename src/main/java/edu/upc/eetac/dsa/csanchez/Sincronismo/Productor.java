package edu.upc.eetac.dsa.csanchez.Sincronismo;

public class Productor implements Runnable{
	
	private String frase = null;
	private Buffer buffer = null;
	
	public Productor (String frase, Buffer buffer){
		
		this.buffer=buffer;
		this.frase=frase;
	}
	
	 public void run() {
	        char chars[] = frase.toCharArray();
	        for (char x : chars) {
	            buffer.put(x);
	            System.out.println("Hola, muy buenos días " + x);
	        }
	    }

	

}
