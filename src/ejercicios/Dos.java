/*
    MIT License.
*/

package ejercicios;

/**
 *
 * @author Antonio Vidal
 */
public class Dos {
    
    // Coger las letras que formen la palabra BUG y devolverlas en un array
    
    public static void execute() {
        char entrada[] = {
                            'u', 'j', 'x',
                            'g', 'b', 'e'
                         };
        
        char salida[] = coger_letras(entrada);
        
        if(comprobar(salida)) {
            System.out.println("Ejercicio 2 correcto!");
        }
        else {
            System.out.println("Ejercicio 2 incorrecto!");
        }
    }
    
    private static char[] coger_letras(char entrada[]) {
        // TODO
        return null;
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="NO MIRAR">
    private static boolean comprobar(char salida[]) {
        return salida != null &&
                salida[0] == 'b' &&
                salida[1] == 'u' &&
                salida[2] == 'g';
        
    }
//</editor-fold>
}
