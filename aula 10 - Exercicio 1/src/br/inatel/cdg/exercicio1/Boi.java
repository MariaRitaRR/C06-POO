package br.inatel.cdg.exercicio1;

public class Boi extends Mamifero{


    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    void emitirSom() {
        System.out.println("Muu...");

    }
}
