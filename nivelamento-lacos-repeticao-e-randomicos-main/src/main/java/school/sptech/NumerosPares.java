package school.sptech;

public class NumerosPares {

    public static void main(String[] args) {

        Integer n = 0;

        while (n <= 40) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }
    }
}
