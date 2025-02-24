// se importa la libreria Scanner para introducir datos desde el teclado
import java.util.Scanner;
// Nombre de la clase
class MainR {
    // Metodo main
    public static void main(String[] args) {
        // Objeto Scanner para almacenar los datos del usuario
        Scanner op = new Scanner(System.in);
        // Objeto para asignar y obtener los valores de la resta
        Resta r1 = new Resta();
        // declaracion de variable para introducir datos en el switch
        int e;
        // inicio del do while
        do {
            // opciones del menu
            System.out.println("1. Realizar Resta");
            System.out.println("0. Salir");
            // lectura del valor asignado a la variable, donde el usuario ingresa su opcion
            e = op.nextInt();
            switch (e) {
                // Caso 1 que realiza la opcion resta
                case 1:
                    System.out.println("Ingresa un numero");
                    r1.setA(op.nextInt());
                    System.out.println("Ingresa un numero");
                    r1.setB(op.nextInt());
                    System.out.println(r1.getA() - r1.getB());
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
        } while (e != 0);
    }
}