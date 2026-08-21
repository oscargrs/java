package school.sptech;

public class Main {

    public static void main(String[] args) {

        Auxiliar auxiliar = new Auxiliar();
        Integer[] vetor = new Integer[11];

        for (int i = 0; i < 11; i++) {
            vetor[i] = i;
        }

        auxiliar.media(vetor);
    }
}
