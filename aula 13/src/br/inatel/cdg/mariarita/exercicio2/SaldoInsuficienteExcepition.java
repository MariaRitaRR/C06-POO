package br.inatel.cdg.mariarita.exercicio2;

public class SaldoInsuficienteExcepition extends RuntimeException {
    public SaldoInsuficienteExcepition(String msg) {
        super(msg);
    }
}
