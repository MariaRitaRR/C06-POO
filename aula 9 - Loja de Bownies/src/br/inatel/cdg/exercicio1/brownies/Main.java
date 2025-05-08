package br.inatel.cdg.exercicio1.brownies;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BrownieCafe bwCafe = new BrownieCafe("Cafe",15,"Cafe");
        BrownieNutella bwNutella = new BrownieNutella("Nutella",20,"Nutella");
        BrownieDoceDeLeite bwDoceDeLeite = new BrownieDoceDeLeite("Doce De Leite",10,"Doce De Leite");

        bwNutella.addCarrinhoDeCompras();
        bwCafe.addCarrinhoDeCompras();
        bwCafe.adicionaCafe();

        bwCafe.mostraInfo();
        bwNutella.mostraInfo();
        bwDoceDeLeite.mostraInfo();

    }
}