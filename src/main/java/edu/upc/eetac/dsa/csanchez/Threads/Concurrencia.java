package edu.upc.eetac.dsa.csanchez.Threads;

public class Concurrencia {

	public static void main (String[] args) throws InterruptedException{
		
		ClaseThread t = new ClaseThread("clase thread");
		Thread r = new Thread(new ClaseRun("clase run"));
		
		t.start();
		r.start();
		
		t.join();
		r.join();
		
		 System.out.println("Se acabó.");
	}
	
}
