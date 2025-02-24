// libreria
import java.util.Scanner;
// main clase multiplicación
class MainMultiplicacion {
    // metodo main
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // Objeto 
        Multiplicacion m1 = new Multiplicacion();
        // declarar variable para salir
        int opc;
        // inicio del do while
        do {
            // pedir al usuario que ingrese numero
            System.out.println("Ingresa un numero");
            // leer numero
            m1.setA(sc.nextInt());
            System.out.println("Ingresa un numero");
            m1.setB(sc.nextInt());
            // imprimir resultado
            System.out.println("La respuesta es: " + (m1.getA() * m1.getB()));
            // opcion para salir o continuar
            System.out.println("0 para salir o cualquier otra tecla para repetir");
            // leer opcion
            opc = sc.nextInt();
        // cierre do while
        } while (opc != 0);
    }
}