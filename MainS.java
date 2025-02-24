// se importa la libreria Scanner para introducir datos desde el teclado
import java.util.Scanner;
// Nombre de la clase
class MainS {
    // Metodo main
    public static void main(String[] args) {
        // Objeto Scanner para almacenar los datos del usuario
        Scanner op = new Scanner(System.in);
        // Objeto para asignar y obtener los valores de la suma
        Suma s1 = new Suma();
        // declaracion de variable para introducir datos en el switch
        int k;
        // inicio del do while
        do {
            // opciones del menu
            System.out.println("1. Realizar Suma");
            System.out.println("0. Salir");
            // lectura del valor asignado a la variable, donde el usuario ingresa su opcion
            k = op.nextInt();
            switch (k) {
                // Caso 1 que realiza la opcion suma
                case 1:
                    System.out.println("Ingresa un numero");
                    s1.setA(op.nextInt());
                    System.out.println("Ingresa un numero");
                    s1.setB(op.nextInt());
                    System.out.println(s1.getA() + s1.getB());
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
        } while (k != 0);
    }
}