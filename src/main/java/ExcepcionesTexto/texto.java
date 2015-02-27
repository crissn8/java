package ExcepcionesTexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class texto {

	
	 public final static int media() throws FileParsingException, BigNumberException {
	 
			
	int contador = 0;
	int sum = 0;
    File archivo = null;
   // FileReader fr = null;
    BufferedReader br = null;
   
    try {
   	 archivo = new File ("C:\\Users\\Cristina\\Documents\\uni\\DSA\\excepcion.txt");
   	 br = new BufferedReader(new FileReader(archivo));
   	 String linia = null;
   	 
     while ((linia = br.readLine()) != null){
    	 
    	 try{ 
    		 int numero = Integer.parseInt(linia);
    		 if ( numero > 1000)
    		 {
    			 throw new BigNumberException("Número mayor que 1000, en la línea: " + (int) (++contador));
    		 }
    		 
    		 else{
    			 
    			 sum += numero;
    			 contador++;
    			 }
    	 }
    		catch (NumberFormatException e) {
    			throw new FileParsingException(e.getMessage());
             }
         }
     } catch (java.io.IOException e) {
         throw new FileParsingException(e.getMessage());
     } finally {
         try {
             br.close();
         } catch (IOException e) {
             System.err.println("warning: can not close file.");
         }
     }
    	return sum / contador;
    
    	 }
     }
   	 
  
