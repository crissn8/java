package edu.upc.eetac.dsa.csanchez.interfaces;

public class Rectangle extends AbstractShape{
	
	int altura;
	int base;
	
	
	public Rectangle(int altura, int base) {
		super("rectangle");
		this.altura = altura;
		this.base = base;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public int getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = base;
	}

	public  String funcio() {

		return "rectangle";
		
	}

	public  double area() {
	
		double resposta = 0;
		
		if (this.altura!=0||this.base!=0 ){
			
			resposta = base*altura;
		}
		
		return resposta;
		
	}

	
}
