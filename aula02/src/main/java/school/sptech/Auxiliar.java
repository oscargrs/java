package school.sptech;

public class Auxiliar {

    void dizerBoaTarde() {
        System.out.println("Boa tarde!");
    }

    void dizerBoaTarde(String nome) {
        System.out.printf("Boa tarde %s!!!", nome);
    }

    void media(Integer[] vetor) {
        Integer total = 0;

        for (int i = 0; i < vetor.length; i++) {
            total += vetor[i];
        }

        Integer mediaa = total / vetor.length;

        System.out.println(mediaa);
    }
}
