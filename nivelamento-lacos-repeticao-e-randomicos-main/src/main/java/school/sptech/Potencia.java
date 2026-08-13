package school.sptech;

public class Potencia {

    public static void main(String[] args) {

        Integer a = 2;
        Integer b = 5;
        Integer r = a;

        for (int i = 1; i < b; i++) {
            r = r * a;
        }

        System.out.println(r);
    }
}
