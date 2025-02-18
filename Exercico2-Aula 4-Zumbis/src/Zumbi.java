public class Zumbi {

    double vida;
    String nome;

    void transfereVida(Zumbi zumbiAlvo,Zumbi zumbiDoador, double quantiaDeVida){
        zumbiAlvo.vida += quantiaDeVida;
        zumbiDoador.vida -= quantiaDeVida;

    }

}
