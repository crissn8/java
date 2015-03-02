package edu.upc.eetac.dsa.csanchez.Sincronismo;

public class Buffer {
	
 private char[] buffer;
 private int inicio;
 private int fin;
 
 public Buffer (){
	 buffer = new char[32];
	 this.inicio= 0; //todo lo que hemos leido hasta el momento
	 this.fin = 0;	//nuevas letras incorporadas
 }
		
		public synchronized char get(){
				
		while (vacio())
			try{  wait();
	            } catch (InterruptedException e) {
	            }
			char x =buffer[inicio++]; //vamos recorriendo todas las posiciones del vector
			if(inicio==buffer.length){ // si lo que hemos leido es = a la long del buffer, 
										//quiere decir q no hay nada nuevo y no podemos insertar ningún carácter nuevo
				inicio = 0;				// volvemos a empezar a leer el buffer hasta encntrar un carácter no leído
			}
			notifyAll();
			return x;
		}
			
		public synchronized void put(char x){
			while (lleno())
				try{
					wait();
					}catch (InterruptedException e) {
		            }
			buffer[fin++]=x; //recorremos todas las 
			if(fin==buffer.length){
				fin=0;
			}
			
			  notifyAll();
		}
		
		private boolean lleno() {
			
			if (fin +1 == inicio){
				
				return true;
			}
			if ((fin == buffer.length -1)&& inicio ==0){
				return true;
			}
			return false;

		}

		private boolean vacio() {
			return inicio==fin;
		}

		

}
