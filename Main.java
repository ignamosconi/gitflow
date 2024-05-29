public class Main {
    public static void main(String args[]) { ;
        Calculadora calcu1 = new Calculadora();
        System.out.println(calcu1.sumar(1,5));
        System.out.println(calcu1.restar(5,1));
        System.out.println(calcu1.dividir(10,2));
        System.out.println("Factorial: " + calcu1.factorial(5));
        System.out.println("Raiz Cuadrada: " + calcu1.raizCuadrada(16));
        System.out.println(calcu1.multiplicar(2, 3));
        System.out.println(calcu1.potencia(2,5));
    }
}