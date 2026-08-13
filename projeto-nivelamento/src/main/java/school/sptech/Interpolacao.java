package school.sptech;

public class Interpolacao {

    public static void main(String[] args) {

        String nome = "Manoel";
        Integer idade = 25;
        Long dinheiroNaConta = 100000000000L;
        Double peso = 69.45;
        Float altura = 1.75f;
        Character genero = 'm';
        Boolean temCarro = false;

        String mensagem = String.format("Meu nome é %s", nome);

        System.out.println(mensagem);
        System.out.printf("Minha idade é %d e meu patrimonio é %d\n",
                idade, dinheiroNaConta);

        String blocoMensagem = """
                Meu peso é %.2f
                Minha altura é %.1f
                Meu genero é %c
                Tenho carro? %b
                Bateria no celular 55%%
                """.formatted(peso, altura, genero, temCarro);

        System.out.println(blocoMensagem);
    }
}
