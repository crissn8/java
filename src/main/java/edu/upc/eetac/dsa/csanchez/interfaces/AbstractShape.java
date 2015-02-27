package edu.upc.eetac.dsa.csanchez.interfaces;

public abstract class AbstractShape implements Shape{
	
	 String tipo;
	
	public AbstractShape (String tipo){
		this.tipo = tipo;
		
		salida();
	}
	
	public void salida(){
		
		String Respuesta = "";
		
		if (this.tipo!=null){
			
			Respuesta = "I'm a " ;
		}
		
		System.out.println(Respuesta);
	}
	

}
