package edu.upc.eetac.dsa.csanchez.java;

public class tree {
	
int altura = 0;
String nombre;


public tree (int altura, String nombre){
	this.altura=altura;
	this.nombre=nombre;
	salida();
	
	}
public tree(int altura){
	this.altura = altura;
	salida();
	}
public tree (String nombre){
	this.nombre = nombre;
	salida();
	}

public tree (){
	salida();
	}

public void salida(){
	
	String response = "";
	
	if ((this.altura!=0)&&(this.nombre!=null)){
		
		response = (" Un " + this.nombre + " de " + this.altura + " metros.");
		
	}
	if ((this.altura!=0)&&(this.nombre==null)){
		
		response = (" Un árbol de " + this.altura + " metros.");
		
	}
	if ((this.altura==0)&&(this.nombre==null)){
		
		response = (" Un árbol. ");
		
	}

	if ((this.altura==0)&&(this.nombre!=null)){
	
	response = (" Un " + this.nombre + ".");
	
	}
	
	
//	return response;
	System.out.println(response);
	
}


}

