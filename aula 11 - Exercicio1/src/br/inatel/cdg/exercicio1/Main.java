package br.inatel.cdg.exercicio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Albert", 100);
        Lontra lontra = new Lontra("Lala", 100);
        Boi boi = new Boi("Serjão Berrantero",100);
        Golfinho golfinho = new Golfinho("Lumia",100);

        cachorro.emitirSom();
        lontra.emitirSom();
        boi.emitirSom();
        golfinho.emitirSom();

        cachorro.mostraInfo();
        lontra.mostraInfo();
        boi.mostraInfo();
        golfinho.mostraInfo();

        lontra.nadar();
        golfinho.nadar();
    }
}