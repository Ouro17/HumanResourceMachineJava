/*
    MIT License.
*/

package retos;

/**
 *
 * @author Antonio Vidal
 */
public class Reto_2 {
    // EJERCICIO RETO
    // Octuplica( multiplicar por 8) cada elemento de la entrada y pon el resultado en la salida
    // hazlo sin multiplicar, solo puedes usar la suma.
    public static void execute() {
        int entrada[] = {4, -7, 3, 0};
        int salida[] = octuplicar(entrada);
        
        if(comprobar(entrada, salida)) {
            System.out.println("Ejercicio RETO 2 correcto!");
        }
        else {
            System.out.println("Ejercicio RETO 2 incorrecto!");
        }
    }
    
    public static int[] octuplicar(int entrada[]) {
        // TODO
        return null;
    }
    
    //<editor-fold defaultstate="collapsed" desc="NO MIRAR">
    public static boolean comprobar(int entrada[], int salida[]) {
        boolean respuesta = entrada != null && salida != null
                && entrada.length == salida.length;
        
        if(respuesta) {
            for(int i = 0; i < entrada.length; i++) {
                if((entrada[i] * 8) != salida[i]) {
                    respuesta = false;
                }
            }
        }
        
        return respuesta;
    }
//</editor-fold>
}
