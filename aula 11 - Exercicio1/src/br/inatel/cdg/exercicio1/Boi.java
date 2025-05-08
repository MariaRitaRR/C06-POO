package br.inatel.cdg.exercicio1;

public class Boi extends br.inatel.cdg.exercicio1.Mamifero {


    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    void emitirSom() {
        System.out.println("Muuuu...");

    }
}
