import java.util.Scanner;

public class MainMulti { // Declaracion de clase 
    public static void main(String[] args) { // Metodo main(metodo de entrada)
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        boolean salir = false; // Variable para controlar el bucle

        while (!salir) { // Bucle que se ejecuta hasta que 'salir' sea verdadero
            // Mostrar el menú de opciones
            System.out.println("Menú:");
            System.out.println("1. Hacer una multiplicación");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt(); // Leer la opción elegida por el usuario

            switch (opcion) { // Declaramos un Switch para el menu 
                case 1:
                    Multi multiplicacion = new Multi(); // Crear una instancia de la clase Multi

                    System.out.print("Introduce el primer número: ");
                    multiplicacion.setNum(scanner.nextInt()); // Leer y establecer el primer número

                    System.out.print("Introduce el segundo número: ");
                    multiplicacion.setNum2(scanner.nextInt()); // Leer y establecer el segundo número

                    // Calcular y mostrar el resultado de la multiplicación
                    int resultado = multiplicacion.getNum() * multiplicacion.getNum2();
                    System.out.println("El resultado de la multiplicación es: " + resultado);
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