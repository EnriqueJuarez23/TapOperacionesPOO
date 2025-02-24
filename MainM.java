// se importa la libreria Scanner para introducir datos desde el teclado
import java.util.Scanner;
// Nombre de la clase
class MainM {
    // Metodo main
    public static void main(String[] args) {
        // Objeto Scanner para almacenar los datos del usuario
        Scanner op = new Scanner(System.in);
        // Objeto para asignar y obtener los valores de la multiplicacion 
        Multiplicacion m1 = new Multiplicacion();
        // declaracion de variable para introducir datos en el switch
        int s;
        // inicio del do while
        do {
            // opciones del menu
            System.out.println("1. Realizar Multiplicacion");
            System.out.println("0. Salir");
            // lectura del valor asignado a la variable, donde el usuario ingresa su opcion
            s = op.nextInt();
            switch (s) {
                // Caso 1 que realiza la opcion multiplicacion
                case 1:
                    System.out.println("Ingresa un numero");
                    m1.setA(op.nextInt());
                    System.out.println("Ingresa un numero");
                    m1.setB(op.nextInt());
                    System.out.println(m1.getA() * m1.getB());
                    break;
                    // Caso 0 opcion que cierra el menu 
                case 0:
                    System.out.println("¡Hasta Luego!");
                    break;
                    // indicacion para ociones erroneas
                default:
                    System.out.println("Opcion incorrecta");
            }
            // Cierre del do while 
        } while (s != 0);
    }
}