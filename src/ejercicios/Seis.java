/*
    MIT License.
*/

package ejercicios;

/**
 *
 * @author Antonio Vidal
 */
public class Seis {
    // Envía a la salida todo lo que NO SEAN CEROS.
    
    public static void execute() {
        int entrada[] = { 7, 0, 7, 1, 0, 0, 7, 0, 1 };
        int salida[] = no_ceros(entrada);
        
        if(comprobar(entrada, salida)) {
            System.out.println("Ejercicio 6 correcto!");
        }
        else {
            System.out.println("Ejercicio 6 incorrecto!");
        }
        
    }
    
    private static int[] no_ceros(int entrada[]) {
        // TODO
        return null;
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="NO MIRAR">
    
    private static int contar_no_ceros(int entrada[]) {
        int respuesta = 0;
        
        for(int n : entrada) {
            if(n != 0) {
                respuesta++;
            }
        }
        
        return respuesta;
    }
    
    private static boolean ningun_cero(int salida[]) {
        boolean respuesta = true;
        
        for(int n : salida) {
            if(n == 0){
                respuesta = false;
            }
        }
        
        return respuesta;
    }
    
    private static boolean comprobar(int entrada[], int salida[]) {
        return entrada != null && 
               salida  != null &&
               contar_no_ceros(entrada) == salida.length &&
               ningun_cero(salida);
               
    }
//</editor-fold>
}
