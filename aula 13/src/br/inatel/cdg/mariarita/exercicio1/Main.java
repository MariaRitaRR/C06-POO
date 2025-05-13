package br.inatel.cdg.mariarita.exercicio1;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Mary", 123456);
        Cliente cliente2 = new Cliente("Anna", 987456);
        Cliente cliente3 = null;

        Conta conta = new Conta(2000, 200);

        conta.addCliente(cliente1);
        conta.addCliente(cliente2);
        conta.addCliente(cliente3);

        conta.mostraInfo();


        System.out.println("Fim da Main");
    }
}
