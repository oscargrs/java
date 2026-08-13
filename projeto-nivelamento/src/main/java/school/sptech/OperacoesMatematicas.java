package school.sptech;

public class OperacoesMatematicas {

    public static void main(String[] args) {

        // +, -, *, /, %, **

        Double n1 = 10.0;
        Double n2 = 6d;

        System.out.println("Adição: " + (n1 + n2));
        System.out.println("Subtração: " + (n1 - n2));
        System.out.println("Divisão: " + (n1 / n2));
        System.out.println("Multiplicação: " + (n1 * n2));
        System.out.println("Resto da divisão: " + (n1 % n2));
        System.out.println("Potenciação: " + Math.pow(n1, n2));

        Integer i1 = 10;
        Integer i2 = 1_000_000_000;

        System.out.println("Divisão: " + (i1.doubleValue() / i2));
    }
}
