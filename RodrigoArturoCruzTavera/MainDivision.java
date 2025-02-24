// libreria
import java.util.Scanner;
// main clase división
class MainDivision {
    // metodo main
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // Objeto 
        Division d1 = new Division();
        // declarar variable para salir
        int opc;
        // inicio del do while
        do {
            // pedir al usuario que ingrese numero
            System.out.println("Ingresa un numero");
            // leer numero
            d1.setA(sc.nextInt());
            System.out.println("Ingresa un numero");
            d1.setB(sc.nextInt());
            // verificar si el divisor es cero
            if (d1.getB() != 0) {
                // imprimir resultado
                System.out.println("La respuesta es: " + ((double) d1.getA() / d1.getB()));
            } else {
                System.out.println("Error: No se puede dividir por cero");
            }
            // opcion para salir o continuar
            System.out.println("0 para salir o cualquier otra tecla para repetir");
            // leer opcion
            opc = sc.nextInt();
        // cierre do while
        } while (opc != 0);
    }
}