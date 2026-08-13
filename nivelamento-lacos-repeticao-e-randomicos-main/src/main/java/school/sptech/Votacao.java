package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Votacao {

    public static void main(String[] args) {

        Integer m = 0;
        Integer c = 0;
        Integer q = 0;
        String f = "";

        for (int i = 0; i < 10; i++) {
            Integer v = ThreadLocalRandom.current().nextInt(1,4);

            if (v == 1) {
                m++;
            } else if (v == 2) {
                c++;
            } else {
                q++;
            }
        }

        if (m >= c) {
            if (m > q) {
                f = "Mussarela";
            } else {
                f = "Quatro queijos";
            }
        } else if (c > q) {
            f = "Calabresa";
        }

        System.out.printf("Votos em cada sabor:\n Mussarela: %d\n Quatro Queijos: %d\n Calabresa: %d\n", m, q, c);
        System.out.printf("Sabor favorito: %s", f);
    }
}
