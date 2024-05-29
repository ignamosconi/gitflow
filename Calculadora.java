public class Calculadora implements Operaciones {

    //Constructor (vacío porque no usamos argumentos)
    public Calculadora() {}

    public int sumar(int num1, int num2) {
        return (num1 + num2);
    }

    public int factorial(int num1) {
        if (num1 < 0) {
            throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo.");
        }
        int result = 1;
        for (int i = 1; i <= num1; i++) {
            result *= i;
        }
        return result;
    }

    public double raizCuadrada(int num1) {
        if (num1 < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return (int) Math.sqrt(num1);
    }

}
