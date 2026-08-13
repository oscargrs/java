package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {

    public static void main(String[] args) {

        Integer soma = 0;
        Integer n = 1;

        while (n != 0) {
            n = ThreadLocalRandom.current().nextInt(0,11);

            soma += n;
        }

        System.out.printf("A soma dos números é %d", soma);
    }
}
