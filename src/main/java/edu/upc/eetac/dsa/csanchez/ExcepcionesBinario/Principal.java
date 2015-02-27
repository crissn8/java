package edu.upc.eetac.dsa.csanchez.ExcepcionesBinario;

public class Principal {
	
	static String archivo = "C:\\Users\\Cristina\\Documents\\uni\\DSA\\Binario.txt";
	
	public static void main(String[] args) throws Exception{
		
		Escribir escribir = new Escribir (12,2.5,'f');
		escribir.Fichero(archivo);
		


	System.out.println("entero = " + escribir.getI());
	System.out.println("decimal = " + escribir.getD());
	System.out.println("caracter = " + escribir.getC());

	}
}
