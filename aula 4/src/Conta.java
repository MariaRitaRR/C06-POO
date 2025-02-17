public class Conta {
    //atributos
    float saldo;
    float limite;
    int numeroDaConta;
    String nomeDoDono;

    //metodos
    public void sacar(float quantidade){
        if (quantidade < saldo){
            saldo -= quantidade;
        }else {
            System.out.println("Saldo insuficiente");
        }

    }

    public void depositar(float quantidade){
        saldo += quantidade;
    }

    public void transferir(float quantidade, Conta destino){

    }
    public void verificarSaldo(){

    }
}
