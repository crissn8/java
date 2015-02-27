package ExcepcionesTexto;



public class excepciones {
	
	 public static void main(String[] args) {

	     try{
	    	  	int media = texto.media();
	    	  	 System.out.println("La media es = " + media);
	     }
		 
	     catch (FileParsingException e) {
	            e.printStackTrace();
	        } catch (BigNumberException e) {
	            e.printStackTrace();
	        }
	 }

}
