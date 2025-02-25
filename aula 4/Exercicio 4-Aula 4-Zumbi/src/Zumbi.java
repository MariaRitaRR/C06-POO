public class Zumbi {

    double vida;
    String nome;

    boolean transfereVida(Zumbi zumbiAlvo, double quantiaDeVida){

        if(vida >= quantiaDeVida){
            zumbiAlvo.vida += quantiaDeVida;
            vida -= quantiaDeVida;
            return true;
        }else {
            return false;
        }
    }

}