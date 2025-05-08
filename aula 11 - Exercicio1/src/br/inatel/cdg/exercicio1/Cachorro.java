package br.inatel.cdg.exercicio1;

public class Cachorro extends br.inatel.cdg.exercicio1.Mamifero {

    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    void emitirSom() {
        System.out.println("Au Au Au...");
    }
}
