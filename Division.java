class Division {  // Declaración de la clase 'Division'.
    double num1, num2;  // Declaración de dos variables de tipo 'double', 'num1' y 'num2', para almacenar los números con decimales que se utilizarán en la operación de división.

    Division() {  // Constructor de la clase, vacío en este caso, no realiza ninguna acción al crear el objeto.
    }  // Cuerpo del constructor vacío.

    public double getNum1() {  // Método público que devuelve el valor de la variable 'num1'.
        return num1;  // Retorna el valor de 'num1'.
    }

    public void setNum1(double num1) {  // Método público para establecer el valor de 'num1'.
        this.num1 = num1;  // Asigna el valor pasado como parámetro a la variable 'num1'.
    }

    public double getNum2() {  // Método público que devuelve el valor de la variable 'num2'.
        return num2;  // Retorna el valor de 'num2'.
    }

    public void setNum2(double num2) {  // Método público para establecer el valor de 'num2'.
        this.num2 = num2;  // Asigna el valor pasado como parámetro a la variable 'num2'.
    }
}
