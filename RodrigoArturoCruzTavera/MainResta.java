// libreria
import java.util.Scanner;
// main clase resta
class MainResta {
    // metodo main
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // Objeto 
        Resta r1 = new Resta();
        //declarar variable para salir
       int opc;
        // inicio del do while
        do {
                    //pedir al usuario que ingrese numero
                    System.out.println("Ingresa un numero");
                    //leer numero
                    r1.setA(sc.nextInt());
                    System.out.println("Ingresa un numero");
                    r1.setB(sc.nextInt());
                    //imprimir resultado
                    System.out.println("La respuesta es: "+(r1.getA() - r1.getB()));
                    //opcion para salir o continuar
                    System.out.println("0 para salir o cualquier otra tecla para repetir");
                    //leer opcion
                    opc = sc.nextInt();
            // cierre do while
        } while (opc!=0);
    }
}