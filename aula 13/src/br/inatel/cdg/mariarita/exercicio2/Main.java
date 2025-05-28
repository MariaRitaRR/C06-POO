package br.inatel.cdg.mariarita.exercicio2;


public class Main {
    public static void main(String[] args) {

        br.inatel.cdg.mariarita.exercicio1.Cliente cliente1 = new br.inatel.cdg.mariarita.exercicio1.Cliente("Mary", 123456);
        br.inatel.cdg.mariarita.exercicio1.Cliente cliente2 = new br.inatel.cdg.mariarita.exercicio1.Cliente("Anna", 987456);
        br.inatel.cdg.mariarita.exercicio1.Cliente cliente3 = null;

        br.inatel.cdg.mariarita.exercicio1.Conta conta = new br.inatel.cdg.mariarita.exercicio1.Conta(2000, 200);

        conta.addCliente(cliente1);
        conta.addCliente(cliente2);
        conta.addCliente(cliente3);

        conta.mostraInfo();

        Conta conta1 = new Conta(2000, 200);

        try{
            conta1.sacar(5000);
        }catch (SaldoInsuficienteExcepition e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim da Main");
    }
}
