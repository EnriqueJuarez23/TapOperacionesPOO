// Importamos la librería para entrada de datos
import java.util.Scanner; 
// Nombre de la clase
class MainDivision { 
    // Método principal
    public static void main(String[] args) { 
        // Creamos un objeto Scanner
        Scanner sc = new Scanner(System.in); 
        //variable que almacena la opcion del usuario
        int opcion; 
        //bucle do-while para que el menu se repita hasta que el usuario decida salir
        do {
            // Mostramos el menú
            System.out.println("\nElige una opción:");
            System.out.println("1. Dividir");
            System.out.println("2. Salir");
            System.out.print("Opción: ");
            // Leemos la opción del usuario
            opcion = sc.nextInt(); 
            //estructura del switch para ejecutar segun la opcion 
            switch (opcion) {
                case 1:
                    // Creamos un objeto de la clase Division
                    Division a = new Division(); 
                    //pedimos el primer numero 
                    System.out.print("Ingresa el primer número: "); 
                    //le asignamos el valor a la variable con los datos que ingreso el usuario
                    a.setNum(sc.nextInt());
                    // pedimos el segundo numero
                    System.out.print("Ingresa el segundo número: ");
                    // le asignamos el valor a la segunda variable con los datos que ingreso el usuario
                    a.setNum2(sc.nextInt());

                    System.out.println("La division es: " + (a.getNum()/a.getNum2())); //en un sout hacemos la division de los numeros
                    break; //se rompe le caso 1

                case 2:
                    //aqui imprime un mensaje de despedida 
                    System.out.println("Hasta luego :)"); 
                    break;//se rompe el caso 2

                default:
                //al ser un opcion default imprimimos que ingrese una opcion valida
                    System.out.println("Ingresa una opción válida.");
            } // cerramos el switch

           // El bucle se repite hasta que el usuario elija salir 
        } while (opcion != 2); 
        //cerramos el scanner
        sc.close();

    } //cerramos metodo principal

}// cerramos clase