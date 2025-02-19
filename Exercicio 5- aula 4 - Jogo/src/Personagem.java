public class Personagem {

    String nome;
    int vida;
    Arma arma = new Arma();

    void usarArma() {
        arma.resistencia -= 2;
    }
    void tomarDano() {
        vida -= 5;
    }
}
