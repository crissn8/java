package edu.upc.eetac.dsa.csanchez.ExcepcionesBinario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Escribir {
	
	private int i;
	private double d;
	private char c;
	
	public Escribir(int i, double d, char c){
		this.i= i; 
		this.d=d;
		this.c =c;
	
	}

	//para escribir en binario en un fichero, hacemos lo contrario
	public void Fichero(String fichero) throws Exception{
		
		DataOutputStream file = new DataOutputStream(new FileOutputStream(fichero));
		file.writeInt(i);
        file.writeDouble(d);
        file.writeChar(c);
        file.close();
		
	}
	
	public void Leer(String fichero) throws Exception{
		
		DataInputStream file = new DataInputStream(new FileInputStream(fichero));
		int i = file.readInt();
		double d = file.readDouble();
		char c = file.readChar();
	
		Escribir escribir = new Escribir(i, d, c);
	      		
        file.close();
        
        return;
		
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}
	
	
	
	
}
