package Exercicio1;

public class Teste {
    public static void main(String[] args) {
       
        Passageiro p1 = new Passageiro("Fabiane");
        p1.andar();

        Pessoa p2 = new Pessoa("Denji");
        p2.andar();

        Pessoa p3 = new Passageiro("Jorge");
        p3.andar();

        Cobrador<Passageiro> cobradorPassageiro = new Cobrador<>();
        cobradorPassageiro.cobrarDinheiro(p1);

        Cobrador<Pessoa> cobradorPessoa = new Cobrador<>();
        cobradorPessoa.cobrarDinheiro(p2);
        cobradorPessoa.cobrarDinheiro(p3);
    }
}
