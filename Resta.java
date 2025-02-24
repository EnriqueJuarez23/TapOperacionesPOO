class Resta {  // Declaración de la clase 'Resta'.
    int num1, num2;  // Declaración de dos variables enteras: 'num1' y 'num2', que almacenarán los números para la resta.

    Resta() {  // Constructor de la clase, vacío en este caso, no realiza ninguna acción al crear el objeto.
    }  // Cuerpo del constructor vacío.

    public int getNum1() {  // Método público que devuelve el valor de la variable 'num1'.
        return num1;  // Retorna el valor de 'num1'.
    }

    public void setNum1(int num1) {  // Método público para establecer el valor de 'num1'.
        this.num1 = num1;  // Asigna el valor pasado como parámetro al atributo 'num1'.
    }

    public int getNum2() {  // Método público que devuelve el valor de la variable 'num2'.
        return num2;  // Retorna el valor de 'num2'.
    }

    public void setNum2(int num2) {  // Método público para establecer el valor de 'num2'.
        this.num2 = num2;  // Asigna el valor pasado como parámetro al atributo 'num2'.
    }
}
