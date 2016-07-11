/*
    MIT License.
*/

package ejercicios;

/**
 *
 * @author Antonio Vidal
 */
public class Siete {
    // Envía a la salida todo lo que SEAN CEROS.
    
    public static void execute() {
        int entrada[] = { 7, 0, 7, 1, 0, 0, 7, 0, 1 };
        int salida[] = ceros(entrada);
        
        if(comprobar(entrada, salida)) {
            System.out.println("Ejercicio 7 correcto!");
        }
        else {
            System.out.println("Ejercicio 7 incorrecto!");
        }
        
    }
    
    private static int[] ceros(int entrada[]) {
        // TODO
        return null;
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="NO MIRAR">
    
    private static int contar_ceros(int entrada[]) {
        int respuesta = 0;
        
        for(int n : entrada) {
            if(n == 0) {
                respuesta++;
            }
        }
        
        return respuesta;
    }
    
    private static boolean todos_ceros(int salida[]) {
        boolean respuesta = true;
        
        for(int n : salida) {
            if(n != 0){
                respuesta = false;
            }
        }
        
        return respuesta;
    }
    
    private static boolean comprobar(int entrada[], int salida[]) {
        return entrada != null && 
               salida  != null &&
               contar_ceros(entrada) == salida.length &&
               todos_ceros(salida);
               
    }
//</editor-fold>
}
