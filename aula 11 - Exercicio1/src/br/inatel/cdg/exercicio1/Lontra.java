package br.inatel.cdg.exercicio1;

public class Lontra extends Mamifero implements Aquatico {
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    void emitirSom() {
        System.out.println("Hra Hra Hra..");
    }

    @Override
    public void nadar() {
        System.out.println("A lontra " + nome + " está nadando..." );
    }
}
