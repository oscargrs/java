package school.sptech;

public class ex2 {

  public static void main(String[] args) {

    Integer minutosAquecendo = 10;
    Integer minutosAerobica = 30;
    Integer minutosMusculacao = 60;

    Integer calorias = (minutosAquecendo * 12) + (minutosAerobica * 20) + (minutosMusculacao * 25);
    Integer minutosTotais = minutosAquecendo + minutosAerobica + minutosMusculacao;

    System.out.printf("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias.", minutosTotais, calorias);
  }
}