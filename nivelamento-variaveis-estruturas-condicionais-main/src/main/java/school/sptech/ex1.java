package school.sptech;

public class ex1 {

    public static void main(String[] args) {

        //

        Integer filhos0a3 = 2;
        Integer filhos4a16 = 2;
        Integer filhos17a18 = 2;
        Integer totalFilhos = filhos0a3 + filhos4a16 + filhos17a18;

        Double bolsa = (filhos0a3 * 25.12) + (filhos4a16 * 15.88) + (filhos17a18 * 12.44);

        System.out.println("Você tem um total de " + totalFilhos + " filhos e vai receber R$" + bolsa + " de bolsa");
    }
}