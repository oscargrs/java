package school.sptech;

public class OperadorEquals {

    public static void main(String[] args) {

        Integer i1 = 10000000;
        Integer i2 = 10000000;

        if (i1 == 10000000) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

        String nome1 = "Manoel";
        String nome2 = "Manoel";

        if (nome1.equals(nome2)) {
            System.out.println("São textos iguais");
        }

        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("São iguais ignore case");
        }
    }
}
