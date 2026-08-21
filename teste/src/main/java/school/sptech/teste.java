package school.sptech;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = scanner.nextLine();
        String resultado = "normal";

        nome = nome.toLowerCase();
        if (nome.equals("luiz")) {
            resultado = "felipe";
        }

        System.out.printf("Você é %s", resultado);
    }
}