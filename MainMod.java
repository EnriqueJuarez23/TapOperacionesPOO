import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario desde la consola.

class MainMod { // Declaramos la clase principal 'MainMod', que contiene el método 'main' que ejecuta el programa.
    public static void main(String[] args) { // Método principal donde comienza la ejecución del programa.
        // Creamos un objeto de la clase Scanner para poder leer los valores ingresados por el usuario.
        Scanner sc = new Scanner(System.in);

        // Variable para almacenar la opción que el usuario elige en el menú.
        int op;

        // Bucle do-while que se repite hasta que el usuario elige la opción 2 (Salir).
        do {
            // Mostramos el menú de opciones en la consola.
            System.out.println("Menu");
            System.out.println("-------------------");
            System.out.println("Elige una opcion:");
            System.out.println("1. Mostrar el modulo de 2 numeros"); // Opción para calcular el módulo.
            System.out.println("2. Salir"); // Opción para salir del programa.
            System.out.print("Opcion: ");
            
            // Leemos la opción que el usuario ingresa y la almacenamos en la variable 'op'.
            op = sc.nextInt();
            
            // Usamos un switch para manejar las diferentes opciones del menú.
            switch (op) {
                case 1:
                    // Si el usuario elige la opción 1, creamos un objeto de la clase 'Modulo' para realizar la operación de módulo.
                    Modulo mo = new Modulo();
                    
                    // Le pedimos al usuario que ingrese el primer número para calcular el módulo.
                    System.out.print("Ingresa el primer numero: ");
                    // Almacenamos el valor ingresado en la variable 'num1' del objeto 'mo'.
                    mo.setNum1(sc.nextInt());
                    
                    // Le pedimos al usuario que ingrese el segundo número para calcular el módulo.
                    System.out.print("Ingresa el segundo numero: ");
                    // Almacenamos el valor ingresado en la variable 'num2' del objeto 'mo'.
                    mo.setNum2(sc.nextInt());
                    
                    // Calculamos y mostramos el resultado del módulo de los dos números.
                    System.out.println("El modulo es: " + (mo.getNum1() % mo.getNum2()));
                    System.out.println("---------------------------------");
                    break; // Salimos del case 1 y volvemos a mostrar el menú.

                case 2:
                    // Si el usuario elige la opción 2, se imprime un mensaje de despedida y el programa finaliza.
                    System.out.println("Hasta luego :)");
                    break; // Salimos del case 2 y finaliza el programa.

                default:
                    // Si el usuario ingresa una opción no válida, mostramos un mensaje que le indica que ingrese una opción válida.
                    System.out.println("Ingresa una opcion valida.");
            }

            // El bucle continuará repitiéndose hasta que el usuario elija la opción 2 para salir.
        } while (op != 2);
        
        // Al final del programa, cerramos el objeto 'Scanner' para liberar los recursos del sistema.
        sc.close();
    }
}
