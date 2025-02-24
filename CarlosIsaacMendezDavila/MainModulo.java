import java.util.Scanner;

public class MainModulo { // Declaración de clase
    public static void main(String[] args) { // Método main (método de entrada)
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        boolean salir = false; // Variable para controlar el bucle

        while (!salir) { // Bucle que se ejecuta hasta que 'salir' sea verdadero
            // Mostrar el menú de opciones
            System.out.println("Menú:");
            System.out.println("1. Calcular el módulo (residuo de la división)");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt(); // Leer la opción elegida por el usuario

            switch (opcion) { // Declaramos un Switch para el menú
                case 1:
                    Modulo mod = new Modulo(); // Crear una instancia de la clase Modulo

                    System.out.print("Introduce el primer número: ");
                    mod.setNum(scanner.nextInt()); // Leer y establecer el primer número

                    System.out.print("Introduce el segundo número: ");
                    mod.setNum2(scanner.nextInt()); // Leer y establecer el segundo número

                    // Calcular y mostrar el resultado del módulo
                    int resultado = mod.getNum() % mod.getNum2();
                    System.out.println("El residuo de la división (módulo) es: " + resultado);
                    break;

                case 2:
                    salir = true; // Cambiar 'salir' a verdadero para terminar el bucle
                    System.out.println("Saliste del programa.");
                    break;

                default:
                    // Mostrar un mensaje si la opción no es válida
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
                    break;
            }
        }
    }
}
