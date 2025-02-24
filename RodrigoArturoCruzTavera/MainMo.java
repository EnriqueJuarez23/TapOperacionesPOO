// libreria
import java.util.Scanner;
// main clase módulo
class MainMo {
    // metodo main
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // Objeto 
        Modulo mod1 = new Modulo();
        // declarar variable para salir
        int opc;
        // inicio del do while
        do {
            // pedir al usuario que ingrese numero
            System.out.println("Ingresa un numero");
            // leer numero
            mod1.setA(sc.nextDouble());
            System.out.println("Ingresa un numero");
            mod1.setB(sc.nextDouble());
            // verificar si el divisor es cero
            if (mod1.getB() != 0) {
                // imprimir resultado
                System.out.println("La respuesta es: " + (mod1.getA() % mod1.getB()));
            } else {
                System.out.println("Error: No se puede calcular módulo con divisor 0");
            }
            // opcion para salir o continuar
            System.out.println("0 para salir o cualquier otra tecla para repetir");
            // leer opcion
            opc = sc.nextInt();
        // cierre do while
        } while (opc != 0);
    }
}
