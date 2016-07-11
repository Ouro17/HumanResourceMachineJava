/*
    MIT License.
*/

package ejercicios;

/**
 *
 * @author Antonio Vidal
 */
public class Cinco {
    // Suma cada pareja de la entrada y pon el resultado en la salida
    // ejemplo  si la entrada es 2 3 8 4 -9 3 9 -1 
    // la salida sería 5 12 -6 8
    public static void execute() {
        int entrada[] = {1, 3, 3, 1, -9, 8, 6, -2};
        int salida[] = suma_par(entrada);
        
        if(comprobar(entrada, salida)) {
            System.out.println("Ejercicio 5 correcto!");
        }
        else {
            System.out.println("Ejercicio 5 incorrecto!");
        }
    }
    
    private static int[] suma_par(int entrada[]) {
        // TODO
        return null;
    }
    
    //<editor-fold defaultstate="collapsed" desc="NO MIRAR">
    private static boolean comprobar(int entrada[], int salida[]) {
        boolean respuesta = entrada != null && salida != null
                && (entrada.length / 2) == salida.length;
        if(respuesta) {
            for(int i = 0; i < entrada.length; i += 2) {
                if(entrada[i] + entrada[i+1] != salida[i/2]) {
                    respuesta = false;
                }
            }
        }
        
        return respuesta;
    }
//</editor-fold>
}
