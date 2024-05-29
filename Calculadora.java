public class Calculadora implements Operaciones {

    //Constructor (vacío porque no usamos argumentos)
    public Calculadora() {}

    public int sumar(int num1, int num2) {
        return (num1 + num2);
    }

    public int restar(int num1, int num2){
        return (num1 - num2);
    }

    public double dividir(int num1, int num2){
        return (num1 / num2);
    }

}
