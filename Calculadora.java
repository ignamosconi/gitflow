public class Calculadora implements Operaciones {

    //Constructor (vacío porque no usamos argumentos)
    public Calculadora() {}

    public int sumar(int num1, int num2) {
        return (num1 + num2 + num2);
    }

    //Métodos Igna - rama feature-multPot
    public int multiplicar(int num1, int num2) {
        return (num1 * num2 * num2);
    }

    public double potencia(int base, int exponente) {
        return Math.pow(base,exponente);
    }
}
