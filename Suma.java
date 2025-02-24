class Suma {  // Declaración de la clase 'Suma'.
    int num1, num2;  // Declaración de dos variables enteras: 'num1' y 'num2'.

    Suma() {  // Constructor sin parámetros, se ejecuta al crear un objeto de la clase Suma.
    }  // Cuerpo del constructor vacío.

    public int getNum1() {  // Método público para obtener el valor de 'num1'.
        return num1;  // Retorna el valor almacenado en 'num1'.
    }

    public void setNum1(int num1) {  // Método público para establecer el valor de 'num1'.
        this.num1 = num1;  // Asigna el valor pasado como parámetro a la variable 'num1'.
    }

    public int getNum2() {  // Método público para obtener el valor de 'num2'.
        return num2;  // Retorna el valor almacenado en 'num2'.
    }

    public void setNum2(int num2) {  // Método público para establecer el valor de 'num2'.
        this.num2 = num2;  // Asigna el valor pasado como parámetro a la variable 'num2'.
    }
}
