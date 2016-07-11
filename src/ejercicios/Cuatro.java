/*
    MIT License.
*/

package ejercicios;

/**
 *
 * @author Antonio Vidal
 */
public class Cuatro {
    // Tomar los DOS primeros elementos de la entrada
    // y ponlos en los de salida en orden INVERSO.
    // Repite el proceso hasta que no queden mas elementos
    // en la entrada
    // ejemplo entrada: 4,5,3,7 dará salida 5,4,7,3
    public static void execute() {
        int entrada[] = {1, 7, 4, 3, 5, 0};
        int salida[] = copia_inversa_par(entrada);
        
        if(comprobar(entrada, salida)) {
            System.out.println("Ejercicio 4 correcto!");
        }
        else {
            System.out.println("Ejercicio 4 incorrecto!");
        }
    }
    
    private static int[] copia_inversa_par(int entrada[]) {
        // TODO
        return null;
    }
    
    //<editor-fold defaultstate="collapsed" desc="NO MIRAR">
    private static boolean comprobar(int entrada[], int salida[]) {
        boolean respuesta = entrada != null && salida != null
                && entrada.length == salida.length;
        if(respuesta) {
            for(int i = 0; i < entrada.length; i += 2) {
                if(entrada[i] != salida[i+1] || entrada[i+1] != salida[i]) {
                    respuesta = false;
                }
            }
        }
        
        return respuesta;
    }
//</editor-fold>
}
