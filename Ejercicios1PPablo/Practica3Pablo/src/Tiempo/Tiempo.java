package Tiempo;
import Documento.Principal;

/**
 *
 * @author Pablo Che
 */

public class Tiempo {
    
    Principal prin;
    
    
    public double carga(String url){
        
        long startTime = System.nanoTime();
        
        prin = new Principal();
            
        prin.ObtenerDocument(url);
            
        long elapsedTime = System.nanoTime() - startTime;
        double tiempo = (double) elapsedTime /1000000000.0; 
           
        return tiempo;
    }
}