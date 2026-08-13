package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {

    public static void main(String[] args) {

        Integer s = 67;
        Boolean e = false;
        Integer p = 0;
        Integer c = 0;
        Integer np = 0;
        Integer ni = 0;

        for (int i = 0; i < 200; i++) {
            Integer n = ThreadLocalRandom.current().nextInt(1,101);

            if (!e) {
                if (n == s) {
                    p = i + 1;
                    e = true;
                }
            }

            if (n % 2 == 0) {
                np++;
            } else {
                ni++;
            }

            System.out.println(n);
        }

        System.out.printf("Quando o número foi sorteado pela 1ª vez: %d\n", p);
        System.out.printf("Quantos números pares foram sorteados: %d\n", np);
        System.out.printf("Quantos números ímpares foram sorteados: %d", ni);
    }
}
