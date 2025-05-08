package br.inatel.cdg.exercicio1.brownies;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String none, double preco, String sabor) {
    super(none,preco,sabor);
    }

    public void adicionaCafe()
    {
        System.out.println(super.nome + " adicionando mais cafe");
    }
}
