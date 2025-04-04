package br.inatel.cdg;

import java.util.Arrays;

public class Cliente {
    public String nome;
    public long cpf;
    public Computador[] computadores;
    private int numComputadores;
    private int capAtual;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.capAtual = 5;
        this.computadores = new Computador[this.capAtual];
        this.numComputadores = 0;
    }
    public void adicionaComputador(Computador computador) {
        if(computador==null)
        {
            return;
        }
        if(numComputadores == capAtual) {
            aumentaCapAtual();
        }
        //para que??
        computadores[numComputadores++] = computador;
    }
    private void aumentaCapAtual() {
        int novaCap = capAtual * 2;
        Computador[] novaComputadores = new Computador[novaCap];

        //passa as informações para o array de capacidade maior
        if (numComputadores >= 0) System.arraycopy(computadores, 0, novaComputadores, 0, numComputadores);

        computadores = novaComputadores;
        capAtual = novaCap;

    }
    public float calculaTotalCompra()
    {
        float total = 0;
        for(int i = 0; i < numComputadores; i++) {
            if(computadores[i] != null) {
                total += computadores[i].preco;
            }

        }
        return total;
    }

    public void mostraInfo()
    {
        System.out.println();
        System.out.println("---Informações do Cliente---");

        System.out.println("Nome: " + nome);
        System.out.println();
        System.out.println("CPF: " + cpf);



        if(numComputadores == 0)
        {
            System.out.println();
            System.out.println("--------------------------");
            System.out.println();
            System.out.println("---Nenhum computador comprado---");
            System.out.println();
            System.out.println("--------------------------");
            System.out.println();
        }else{
            System.out.println();
            System.out.println("Computadores comprados: " );
            System.out.println();
            System.out.println("--------------------------");
            for (int i = 0; i < numComputadores; i++) {
                System.out.println("Computador " + (i+1) + ": ");
                computadores[i].mostraPCConfigs();
                System.out.println();
                System.out.println("--------------------------");
                System.out.println();

            }
        }

        System.out.printf("\nTotal da compra: R$ %.2f%n", calculaTotalCompra());
    }

}
