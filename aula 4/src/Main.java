
public class Main {
    public static void main(String[] args) {

        /*
        Criando uma nova instancia
        E atribuindo uma variavel de tipo Conta!
        */
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta();

        conta1.saldo = 10000;
        conta2.saldo = 20000;
        conta3.saldo = 30000;

        //Depositando
        conta1.depositar(100);
        System.out.println(conta1.saldo);

        //Sacando
        conta2.sacar(1000);
        System.out.println(conta2.saldo);
    }
}