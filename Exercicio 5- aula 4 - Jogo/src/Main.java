//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Personagem personagem = new Personagem();
        personagem.nome = "Joao";
        personagem.vida = 150;
        personagem.arma.resistencia = 50;
        personagem.arma.descricao = "Frigideira utilizada pela Rapunzel em enrolados";
        personagem.arma.poder = 15;
        personagem.arma.nome = "Frigideira";

        personagem.arma.mostrarInfoArma();

        personagem.usarArma();
        personagem.tomarDano();
        personagem.usarArma();

        personagem.arma.mostrarInfoArma();
        System.out.println("Vida: "+personagem.vida);

        }
}