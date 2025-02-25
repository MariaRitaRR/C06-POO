public class Personagem {

    String nome;
    int pontos;
    Arma arma;
    void usarArma(int perdaPontos){
        arma.resistencia-=perdaPontos;
    }
    void tomarDano(int dano){
        pontos-=dano;
    }
}
