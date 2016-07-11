/*
    MIT License.
*/

package retos;

/**
 *
 * @author Antonio Vidal
 */
public class Reto_3 {
    // EJERCICIO RETO
    // Cuarentaduplica cada elemento de la entrada y pon el resultado en la salida
    // hadlo sin multiplicar, solo puedes usar la suma.
    public static void execute() {
        int entrada[] = {3, -5, 5, 0};
        int salida[] = cuarentaduplica(entrada);
        
        if(comprobar(entrada, salida)) {
            System.out.println("Ejercicio RETO 3 correcto!");
        }
        else {
            System.out.println("Ejercicio RETO 3 incorrecto!");
        }
    }
    
    public static int[] cuarentaduplica(int entrada[]) {
        // TODO
        return null;
    }
    
    //<editor-fold defaultstate="collapsed" desc="NO MIRAR">
    public static boolean comprobar(int entrada[], int salida[]) {
        boolean respuesta = entrada != null && salida != null
                && entrada.length == salida.length;
        
        if(respuesta) {
            for(int i = 0; i < entrada.length; i++) {
                if((entrada[i] * 40) != salida[i]) {
                    respuesta = false;
                }
            }
        }
        
        return respuesta;
    }
//</editor-fold>   
}
