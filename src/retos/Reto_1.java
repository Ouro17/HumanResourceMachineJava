/*
    MIT License.
*/

package retos;

/**
 *
 * @author Antonio Vidal
 */
public class Reto_1 {
    // EJERCICIO RETO
    // Triplica(multiplicar por 3) cada elemento de la entrada y pon el resultado en la salida
    // hazlo sin multiplicar, solo puedes usar la suma.
    public static void execute() {
        int entrada[] = {6, -4, 1, 0};
        int salida[] = triplicar(entrada);
        
        if(comprobar(entrada, salida)) {
            System.out.println("Ejercicio RETO 1 correcto!");
        }
        else {
            System.out.println("Ejercicio RETO 1 incorrecto!");
        }
    }
    
    public static int[] triplicar(int entrada[]) {
        // TODO
        return null;
    }
    
    //<editor-fold defaultstate="collapsed" desc="NO MIRAR">
    public static boolean comprobar(int entrada[], int salida[]) {
        boolean respuesta = entrada != null && salida != null
                && entrada.length == salida.length;
        
        if(respuesta) {
            for(int i = 0; i < entrada.length; i++) {
                if((entrada[i] * 3) != salida[i]) {
                    respuesta = false;
                }
            }
        }
        
        return respuesta;
    }
//</editor-fold>
}
