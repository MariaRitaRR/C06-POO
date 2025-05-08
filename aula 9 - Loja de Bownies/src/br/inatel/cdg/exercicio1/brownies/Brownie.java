package br.inatel.cdg.exercicio1.brownies;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie (String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras()
    {
        System.out.println("Adicioando no carrinho de compras um: " + nome);

    }
    public void calculateTotalCompra()
    {
        System.out.println("Calculando total de compras: " + nome + ": " + preco);
    }
    public void mostraInfo()
    {
        System.out.println("Brownie: " + nome + ": R$" + preco + " Sabor: " + sabor);
    }

}
