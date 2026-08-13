package school.sptech;

public class ex3 {

    public static void main(String[] args) {

        Double preco = 3.50;
        Integer vendas = 15;
        Integer pago = 60;

        Double troco = pago - (preco * vendas);

        System.out.printf("Seu troco será de R$%.2f", troco);
    }
}
