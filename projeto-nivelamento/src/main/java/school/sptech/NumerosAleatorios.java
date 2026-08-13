package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class NumerosAleatorios {

    public static void main(String[] args) {

        Integer numeroAleatorio =
                ThreadLocalRandom.current().nextInt(10, 21);

        System.out.println(numeroAleatorio);

        Double doubleAleatorio =
                ThreadLocalRandom.current().nextDouble(10, 21);

        System.out.println(doubleAleatorio);
    }
}
