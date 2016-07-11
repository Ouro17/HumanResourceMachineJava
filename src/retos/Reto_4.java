/*
    MIT License.
*/

package retos;

/**
 *
 * @author Antonio Vidal
 */
public class Reto_4 {
    // Por cada par en la entrada:
    // Envía un 0 a la salida si son del mismo signo
    // Envía un 1 a la salida si no lo son.
    
    public static void execute() {
        int entrada[] = { -5, -2, 3, 3, -3, 7, -8, 4};
        int salida[] = signo_iguales(entrada);
        
        if(comprobar(entrada, salida)) {
            System.out.println("Ejercicio RETO 4 correcto!");
        }
        else {
            System.out.println("Ejercicio RETO 4 incorrecto!");
        }
        
    }
    
    private static int[] signo_iguales(int entrada[]) {
        // TODO
        return null;
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="NO MIRAR">
    
    private static boolean comprobar(int entrada[], int salida[]) {
        boolean respuesta = entrada != null && 
                            salida  != null &&
                            entrada.length / 2 == salida.length;
        if(respuesta) {
            int temp[] = new int[entrada.length / 2];
            
            for(int i = 0, j = 0; i < entrada.length; i += 2, j++) {
                int a = entrada[i];
                int b = entrada[i+1];
                
                temp[j] = ((a > 0 && b > 0) || (a < 0 && b < 0)) ? 0 : 1;
            }
            
            for(int i = 0; i < temp.length; i++) {
                if(temp[i] != salida[i]) {
                    respuesta = false;
                }
            }
        }
        
        return respuesta;
    }
//</editor-fold>
}
