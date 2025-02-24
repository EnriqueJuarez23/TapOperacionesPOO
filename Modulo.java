class Modulo {  // Declaramos la clase 'Modulo', que tiene dos atributos 'num1' y 'num2'.
    int num1, num2;  // Definimos dos variables enteras 'num1' y 'num2', que almacenarán los números con los que se calculará el módulo.
    
    Modulo() {  // Constructor por defecto de la clase 'Modulo'. No realiza ninguna acción, ya que no tiene parámetros ni lógica adicional.
    }
    
    // Método getter para obtener el valor de 'num1'.
    public int getNum1() {  
        return num1;  // Retorna el valor almacenado en 'num1'.
    }
    
    // Método setter para asignar un valor a 'num1'.
    public void setNum1(int num1) {  
        this.num1 = num1;  // Asigna el valor proporcionado a 'num1'.
    }
    
    // Método getter para obtener el valor de 'num2'.
    public int getNum2() {  
        return num2;  // Retorna el valor almacenado en 'num2'.
    }
    
    // Método setter para asignar un valor a 'num2'.
    public void setNum2(int num2) {  
        this.num2 = num2;  // Asigna el valor proporcionado a 'num2'.
    }
}
