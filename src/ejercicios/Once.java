/*
    MIT License.
*/

package ejercicios;

/**
 *
 * @author Antonio Vidal
 */
public class Once {
    // Envía todos los elementos de la entrada a la salida
    // PERO si un número es negativo quitale el signo antes.
    // No puedes usar la libería matemática ni multiplicar
    
    
    public static void execute() {
        int entrada[] = { 4, -4, 5, 0, -4, 3, 3};
        int salida[] = positividad_absoluta(entrada);
        
        if(comprobar(entrada, salida)) {
            System.out.println("Ejercicio 11 correcto!");
        }
        else {
            System.out.println("Ejercicio 11 incorrecto!");
        }
        
    }
    
    private static int[] positividad_absoluta(int entrada[]) {
        // TODO
        return null;
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="NO MIRAR">
    
    private static boolean comprobar(int entrada[], int salida[]) {
        boolean respuesta = entrada != null && 
                            salida  != null &&
                            entrada.length == salida.length;
        if(respuesta) {
            for(int i = 0; i < entrada.length; i++) {
                if(Math.abs(entrada[i]) != salida[i]) {
                    respuesta = false;
                }
            }
        }
        
        return respuesta;
    }
//</editor-fold>
}
