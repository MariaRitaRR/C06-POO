package br.inatel.cdg.mariarita.exercicio2;

import br.inatel.cdg.mariarita.exercicio1.Cliente;

import java.util.HashSet;
import java.util.Set;

public class Conta {
    private float saldo;
    private float limite;
    private Set<Cliente> clientes = new HashSet<br.inatel.cdg.mariarita.exercicio1.Cliente>();

    public Conta(float saldo, float limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void addCliente(br.inatel.cdg.mariarita.exercicio1.Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostraInfo() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);

        for (br.inatel.cdg.mariarita.exercicio1.Cliente cliente : clientes) {
            try{
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
            } catch (NullPointerException e) {
                System.out.println("Esse cliente nao existe");
            }
        }

    }
    public void sacar(float valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
        }else{
            throw new SaldoInsuficienteExcepition("Saldo insuficiente");
        }
    }

}

