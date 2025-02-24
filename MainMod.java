// se importa la libreria Scanner para introducir datos desde el teclado
import java.util.Scanner;
// Nombre de la clase
class MainMod {
    // Metodo main
    public static void main(String[] args) {
        // Objeto Scanner para almacenar los datos del usuario
        Scanner op = new Scanner(System.in);
        // Objeto para asignar y obtener los valores del modulo
        Modulo mod1 = new Modulo ();
        // declaracion de variable para introducir datos en el switch
        int y;
        // inicio del do while
        do {
            // opciones del menu
            System.out.println("1. Realizar El modulo");
            System.out.println("0. Salir");
            // lectura del valor asignado a la variable, donde el usuario ingresa su opcion
            y = op.nextInt();
            switch (y) {
                // Caso 1 que realiza la opcion modulo
                case 1:
                System.out.println("Ingresa un numero");
                mod1.setA(op.nextDouble());
                System.out.println("Ingresa un numero");
                mod1.setB(op.nextDouble());
                System.out.println(mod1.getA() % mod1.getB());
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
        } while (y != 0);
    }
}