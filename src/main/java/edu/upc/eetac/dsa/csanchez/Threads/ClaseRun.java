package edu.upc.eetac.dsa.csanchez.Threads;

public class ClaseRun implements Runnable {

	int cont = 0;
	String nombre;
	long LastModified;
	
	public ClaseRun(String nombre){
		
		this.nombre = nombre;
		
	}
	
	public void run() {
	
		for (int i = 0; i < 10; i++) {
			 long nowTime = System.currentTimeMillis();
	         long time = (LastModified == 0) ? 0 : nowTime - LastModified;
	         LastModified = nowTime;
	         
	         System.out.println(this.nombre + ": es el nombre 	Retraso: " + time + " ms. [" + (++cont) + "]");
	         try {
	              Thread.sleep((long) (Math.random() * 2000));
	            } catch (InterruptedException e) {
	              e.printStackTrace();
	            }
		}
		
	}
	
	
	

}
