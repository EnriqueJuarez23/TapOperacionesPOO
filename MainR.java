import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario desde la consola.

class MainR { // Declaramos la clase principal 'MainR'.
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa.
        // Creamos un objeto de la clase Scanner para permitir que el usuario ingrese datos desde la consola.
        Scanner sc = new Scanner(System.in);

        // Variable para almacenar la opción elegida por el usuario en el menú.
        int op;

        // Bucle do-while que permite repetir el menú hasta que el usuario decida salir (opción 2).
        do {
            // Mostramos el menú de opciones al usuario.
            System.out.println("Menu");
            System.out.println("-------------------");
            System.out.println("Elige una opcion:");
            System.out.println("1. Realizar resta");
            System.out.println("2. Salir");
            System.out.print("Opcion: ");
            
            // Leemos la opción que el usuario ingresa y la almacenamos en la variable 'op'.
            op = sc.nextInt();
            
            // Usamos una estructura switch para manejar las diferentes opciones del menú.
            switch (op) {
                case 1:
                    // Si el usuario elige la opción 1, creamos un objeto de la clase 'Resta' para realizar la resta.
                    Resta re = new Resta();
                    
                    // Pedimos al usuario que ingrese el primer número para realizar la resta.
                    System.out.print("Ingresa el primer numero: ");
                    // Almacenamos el valor ingresado en la variable 'num1' del objeto 're'.
                    re.setNum1(sc.nextInt());
                    
                    // Pedimos al usuario que ingrese el segundo número para realizar la resta.
                    System.out.print("Ingresa el segundo numero: ");
                    // Almacenamos el valor ingresado en la variable 'num2' del objeto 're'.
                    re.setNum2(sc.nextInt());
                    
                    // Calculamos y mostramos el resultado de la resta.
                    System.out.println("El resultado de la resta es: " + (re.getNum1() - re.getNum2()));
                    System.out.println("---------------------------------");
                    break; // Salimos del case 1 y volvemos a mostrar el menú.

                case 2:
                    // Si el usuario elige la opción 2, imprimimos un mensaje de despedida.
                    System.out.println("Hasta luego :)");
                    break; // Salimos del case 2 y finaliza el programa.

                default:
                    // Si el usuario ingresa una opción no válida, mostramos un mensaje de error.
                    System.out.println("Ingresa una opcion valida.");
            }

            // El bucle se repite hasta que el usuario elige salir (opción 2).
        } while (op != 2);
        
        // Cerramos el objeto Scanner para liberar los recursos del sistema.
        sc.close();
    }
}
