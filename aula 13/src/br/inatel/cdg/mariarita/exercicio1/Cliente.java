package br.inatel.cdg.mariarita.exercicio1;

public class Cliente {
    private String nome;
    private long cpf;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public long getCpf() {
        return cpf;
    }
}
