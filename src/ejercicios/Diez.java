/*
    MIT License.
*/

package ejercicios;

/**
 *
 * @author Antonio Vidal
 */
public class Diez {
    // Por cada par en la entrada comprueba el mayor de ellos y ponlo
    // en la salida.
    // Si son iguales pon uno de los dos.
    
    public static void execute() {
        int entrada[] = { 4, 7, -3, -8, 8, 8, 8, 3};
        int salida[] = maximizado(entrada);
        
        if(comprobar(entrada, salida)) {
            System.out.println("Ejercicio 10 correcto!");
        }
        else {
            System.out.println("Ejercicio 10 incorrecto!");
        }
        
    }
    
    private static int[] maximizado(int entrada[]) {
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
                temp[j] = (a > b) ? a : b;
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
