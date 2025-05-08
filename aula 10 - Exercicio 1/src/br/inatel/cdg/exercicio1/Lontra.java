package br.inatel.cdg.exercicio1;

public class Lontra extends Mamifero {
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    void emitirSom() {
        System.out.println("Hra Hra Hra..");
    }
}
