package school.sptech;

public class Variaveis {

    public static void main(String[] args) {

        // let numero = 10;
        // let nome = "Manoel";
        // nome = 10;

        // Tipagem estática vs Tipagem dinâmica

        String nome = "Manoel"; // Objeto e tem tamanho dinâmico

        // Tipos primitivos -> Não são objetos e tem tamanho fixo
        int idade = 25; // 32 bits
        long dinheiroNaConta = 100000000000L; // 64 bits
        double peso = 69.45; // 64 bits
        float altura = 1.75f; // 32 bits
        char genero = 'm'; // 16 bits
        boolean temCarro = false; // 1 bit

        // Tipos Wrapper
        Integer oIdade = null;
        oIdade = 25;

        Long oDinheiroNaConta = 100000000000L;
        Double oPeso = 69.45;
        Float oAltura = 1.75f;
        Character oGenero = 'm';

        String nomeMaiusculo = nome.toUpperCase();
        System.out.println(nomeMaiusculo);

        var teste = 10.7f; // Inferência de tipo
//        teste = "Manoel";

        String cor = null;
        System.out.println(cor);
    }
}
