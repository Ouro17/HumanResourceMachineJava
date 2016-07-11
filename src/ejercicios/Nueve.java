/*
    MIT License.
*/

package ejercicios;

/**
 *
 * @author Antonio Vidal
 */
public class Nueve {
    // Por cada par en la entrada comprueba si son iguales y pon uno de ellos
    // en la salida.
    // Descarta los pares que no sean iguales.
    
    public static void execute() {
        int entrada[] = { 7, 1, 5, 5, -5, -4, 3, 3};
        int salida[] = pares_iguales(entrada);
        
        if(comprobar(entrada, salida)) {
            System.out.println("Ejercicio 9 correcto!");
        }
        else {
            System.out.println("Ejercicio 9 incorrecto!");
        }
        
    }
    
    private static int[] pares_iguales(int entrada[]) {
        // TODO
        return null;
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="NO MIRAR">
    
    private static boolean comprobar(int entrada[], int salida[]) {
        boolean respuesta = entrada != null && 
                            salida  != null;
        if(respuesta) {
            int cont = 0;

            for(int i = 0; i < entrada.length; i += 2) {
                if(entrada[i] == entrada[i+1]){
                    cont++;
                }
            }

            respuesta = respuesta && (salida.length == cont);
        }
        
        return respuesta;
    }
//</editor-fold>
}
