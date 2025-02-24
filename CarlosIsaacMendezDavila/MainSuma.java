import java.util.Scanner;

public class MainSuma { // Declaracion de la clase 
    public static void main(String[] args) { // Metodo main(metodo de entrada)
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        boolean salir = false; // Variable para controlar el bucle

        while (!salir) { // Bucle que se ejecuta hasta que 'salir' sea verdadero
            // Mostrar el menú de opciones
            System.out.println("Menú:");
            System.out.println("1. Hacer una suma");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt(); // Leer la opción elegida por el usuario

            switch (opcion) { // Switch para manejar las opciones del menú
                case 1:
                        Suma suma = new Suma(); // Crear una instancia de la clase Suma

                    System.out.print("Introduce el primer número: ");
                    suma.setNum(scanner.nextInt()); // Leer y establecer el primer número

                    System.out.print("Introduce el segundo número: ");
                    suma.setNum2(scanner.nextInt()); // Leer y establecer el segundo número

                    // Calcular y mostrar el resultado de la multiplicación
                    int resultado = suma.getNum() + suma.getNum2();
                    System.out.println("El resultado de la suma es: " + resultado);
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