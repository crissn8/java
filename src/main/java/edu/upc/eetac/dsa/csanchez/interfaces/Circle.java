package edu.upc.eetac.dsa.csanchez.interfaces;

public class Circle extends AbstractShape {

	double radio;
	
	public Circle(double radio) {
		super("circle");
		
		//area();
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}



	public  double area() {
	
		double resposta = 0;
		
		if (this.radio!=0 ){
			
			resposta = Math.PI*radio*radio;
		}
		
		return resposta;
		
	}
	public  String funcio() {
		

		
		return "Circle";
		
	}
	
	

}
