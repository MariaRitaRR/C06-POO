package br.com.inatel.cdg;

public class Conta {

    private int numero;
    private float saldo;
    private float limite;
    private Cliente[] clientes;


    public Conta()
    {
        setClientes((new Cliente[3]));
    }

    public void sacar(float quantia)
    {
        if(quantia <= saldo)
        {
         setSaldo(saldo - quantia);
        }
        else System.out.println("Saldo insuficiente");
    }

    public void deposita(float quantia)
    {
        setSaldo(saldo + quantia);
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getSaldo() {
        return this.saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
