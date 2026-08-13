package school.sptech;

public class Condicionais {

    public static void main(String[] args) {

        Integer idade = 6;

        if (idade < 16) {
            System.out.println("Não pode dirigir nem votar");
        } else if (idade < 18) {
            System.out.println("Pode votar mas não pode dirigir");
        } else {
            System.out.println("Pode votar e dirigir");
        }

        Boolean temCarro = true;

        if (temCarro) {
            System.out.println("Parabens, você tem um carro");
        } else {
            System.out.println("Que pena...");
        }

        // ==, !=, >, <, >= <=, !, ||, &&

//        String mensagem = idade > 16 ? "Uhuuuu" : ":(";
        System.out.println(idade > 16 ? "Uhuuuu" : ":(");
    }
}
