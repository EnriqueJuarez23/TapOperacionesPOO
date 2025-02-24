import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class MainResta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para capturar la entrada del usuario
        boolean salir = false; // Variable para controlar si el usuario quiere salir del programa

        while (!salir) { // Bucle que se ejecuta hasta que el usuario elija salir
            System.out.println("Menú:");
            System.out.println("1. Hacer una resta");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt(); // Capturamos la opción del usuario

            switch (opcion) {
                case 1:
                    Resta resta = new Resta();  // Creamos un objeto de la clase Resta

                    System.out.print("Introduce el primer número: ");
                    resta.setNum(scanner.nextInt()); // Guardamos el primer número en el objeto Resta

                    System.out.print("Introduce el segundo número: ");
                    resta.setNum2(scanner.nextInt()); // Guardamos el segundo número en el objeto Resta

                    // Realizamos la resta usando los métodos de la clase Resta
                    int resultado = resta.getNum() - resta.getNum2();
                    System.out.println("El resultado de la resta es: " + resultado); // Mostramos el resultado
                    break;

                case 2:
                    salir = true; // Cambiamos la variable para salir del bucle
                    System.out.println("Saliste del programa.");
                    break;

                default:
                    // Mensaje si el usuario ingresa una opción no válida
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
                    break;
            }
        }
    }
}
