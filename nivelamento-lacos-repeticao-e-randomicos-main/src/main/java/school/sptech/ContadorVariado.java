package school.sptech;

public class ContadorVariado {

    public static void main(String[] args) {

        Integer n = 15;

        for (; n < 500; n += 15) {
            Double valor = n / 100.0;
            System.out.println(valor);
        }

//        for (double i = 0.15; i < 5; i += 0.15) {
//            System.out.println(i);
//        }

//        Double n = 0.15;
//
//        for (; n < 5; n += 0.15) {
//            System.out.println(n);
//        }
    }
}
