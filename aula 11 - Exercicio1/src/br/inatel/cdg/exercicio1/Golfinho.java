package br.inatel.cdg.exercicio1;

public class Golfinho extends Mamifero implements Aquatico{
    public Golfinho(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void nadar() {
        System.out.println("O golfinho " + nome + " está nadando");

    }

    @Override
    void emitirSom() {
        System.out.println("iiiiih iiiiih iiiiih ...");

    }
}
