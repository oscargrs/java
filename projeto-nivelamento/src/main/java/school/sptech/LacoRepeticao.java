package school.sptech;

public class LacoRepeticao {

    public static void main(String[] args) {

        System.out.println("For de 0 a 9");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("While de 0 a 9");
        int contador = 10;
        while (contador < 10) {
            System.out.println(contador++);
        }

        System.out.println("Do..While de 0 a 9");
        contador = 10;
        do {
            System.out.println(contador++);
        } while (contador < 10);
    }
}
