/*
    MIT License.
*/

package ejercicios;

/**
 *
 * @author Antonio Vidal
 */
public class Tres {
    
    // Copiar en orden inverso cada elemento de la entrada en la salida.
    public static void execute() {
        int entrada[] = {1, 7, 4, 3, 5};
        int salida[] = copia_inversa(entrada);
        
        if(comprobar(entrada, salida)) {
            System.out.println("Ejercicio 3 correcto!");
        }
        else {
            System.out.println("Ejercicio 3 incorrecto!");
        }
    }
    
    private static int[] copia_inversa(int entrada[]) {
        // TODO
        return null;
    }
    
    //<editor-fold defaultstate="collapsed" desc="NO MIRAR">
    private static boolean comprobar(int entrada[], int salida[]) {
        boolean respuesta = entrada != null && salida != null
                && entrada.length == salida.length;
        if(respuesta) {
            for(int i = 0; i < entrada.length; i++) {
                if(entrada[i] != salida[entrada.length - i - 1]){
                    respuesta = false;
                }
            }
        }
        
        return respuesta;
    }
//</editor-fold>
}
