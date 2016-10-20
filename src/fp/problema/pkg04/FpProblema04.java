
package fp.problema.pkg04;
import java.util.*;

public class FpProblema04 {

    /**4.Realizar un programa para calcular los grados °F a partir de un número de °C dado.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c, Op;
        double f;
        Op=Operación();
        
    }

    private static int Operación() {
    int c;
    double f;
    Scanner entradaDatos= new Scanner(System.in);
        System.out.println("Introduce los grados Cº");
        c=entradaDatos.nextInt();
        f= ((c * 9/5) + 32);
        System.out.println("Tu resultado sería:" + f + "fº");
    return c;
    
    }
}

