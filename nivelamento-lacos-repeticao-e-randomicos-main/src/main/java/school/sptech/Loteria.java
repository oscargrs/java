package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

    public static void main(String[] args) {

        Integer escolhido = 7;
        Boolean encontrou = false;
        Integer contador = 0;

        while (!encontrou) {
            contador++;

            Integer numero = ThreadLocalRandom.current().nextInt(0,11);

            System.out.println(numero);

            if (numero == escolhido) {
                if (contador < 4) {
                    System.out.println("Você é MUITO sortudo");
                } else if (contador < 11) {
                    System.out.println("Você é sortudo");
                } else {
                    System.out.println("É melhor você parar de apostar e ir trabalhar");
                }

                encontrou = true;
            }
        }
    }
}