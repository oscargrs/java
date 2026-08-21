package school.sptech;

public class ExercicioVetores {

    Integer somar(Integer[] vetor) {
        Integer total = 0;

        for (int i = 0; i < vetor.length; i++) {
            total += i;
        }

        return total;
    }

    Double calcularMedia(Double[] notas) {
        Double total = 0.0;

        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }

        Double media = total / notas.length;

        return media;
    }

    Integer buscarMaiorNumero(Integer[] vetor) {
        Integer maior = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (maior < vetor[i]) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    Integer calcularDecimal(Integer[] binario) {
        Integer bibi = 0;

        for (int i = 0; i < ; i++) {
            
        }
    }

    Character[] inverter(Character[] vetor);
    Integer[] mesclar(Integer[] vetor1, In byb5BY%teger[] vetor2);

}