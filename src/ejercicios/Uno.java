/*
    MIT License.
*/

package ejercicios;

/**
 *
 * @author Antonio Vidal
 */
public class Uno {
    
    // Copiar cada elemento de la entrada en la salida
    
    public static void execute() {
        int entrada[] = { 8, 7, 1 };
        int salida[] = copiar(entrada);
        
        if(comprobar(entrada, salida)) {
            System.out.println("Ejercicio 1 correcto!");
        }
        else {
            System.out.println("Ejercicio 1 incorrecto!");
        }
        
    }
    
    private static int[] copiar(int entrada[]) {
        // TODO
        return null;
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="NO MIRAR">
    private static boolean comprobar(int entrada[], int salida[]) {
        boolean respuesta = entrada != null && salida != null &&
                entrada.length == salida.length;
        if(respuesta){
            for(int i = 0; i < entrada.length; i++) {
                if(entrada[i] != salida[i]) {
                    respuesta = false;
                }
            }
        }
        
        return respuesta;
    }
//</editor-fold>
}
