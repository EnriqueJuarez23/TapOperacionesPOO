// se importa la libreria Scanner para introducir datos desde el teclado
import java.util.Scanner;
// Nombre de la clase
class MainD {
    // Metodo main
    public static void main(String[] args) {
        // Objeto Scanner para almacenar los datos del usuario
        Scanner op = new Scanner(System.in);
        // Objeto para asignar y obtener los valores de la division
        Division d1 = new Division();
        // declaracion de variable para introducir datos en el switch
        int d;
        // inicio del do while
        do {
            // opciones del menu
            System.out.println("1. Realizar Division");
            System.out.println("0. Salir");
            // lectura del valor asignado a la variable, donde el usuario ingresa su opcion
            d = op.nextInt();
            switch (d) {
                // Caso 1 que realiza la opcion division
                case 1:
                    System.out.println("Ingresa un numero");
                    d1.setA(op.nextDouble());
                    System.out.println("Ingresa un numero");
                    d1.setB(op.nextDouble());
                    System.out.println(d1.getA() / d1.getB());
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
        } while (d != 0);
    }
}