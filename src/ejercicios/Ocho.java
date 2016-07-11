/*
    MIT License.
*/

package ejercicios;

/**
 *
 * @author Antonio Vidal
 */
public class Ocho {
    // Por cada par de elementos en la entrada
    // resta el segundo al primero y colocalo en la salida
    // luego resta el primero al segundo y colocalo tambien en la salida
    // Y así con todos los pares.
    
    public static void execute() {
        int entrada[] = { 4, 8,
                          6, 1,
                          -3, -3,
                          2, -3,
                        };
        int salida[] = resta_pares(entrada);
        
        if(comprobar(entrada, salida)) {
            System.out.println("Ejercicio 8 correcto!");
        }
        else {
            System.out.println("Ejercicio 8 incorrecto!");
        }
        
    }
    
    private static int[] resta_pares(int entrada[]) {
        // TODO
        return null;
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="NO MIRAR">

    private static boolean comprobar(int entrada[], int salida[]) {
        boolean respuesta = entrada != null &&
               salida  != null &&
               entrada.length == salida.length;
        
        if(respuesta) {
            for(int i = 0; i < entrada.length; i += 2) {
                int a = entrada[i+1];
                int b = entrada[i];
                int resta1 = a - b;
                int resta2 = b - a;

                if(resta1 != salida[i] || resta2 != salida[i+1]){
                    respuesta = false;
                }
            }
        }
        
        return respuesta;
    }
//</editor-fold>
}
