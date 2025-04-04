package br.inatel.cdg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente("Maria Rita", 1234567896);

        System.out.println("Bem-vindo á PC Mania!");
        System.out.println("---------------------");
        System.out.println("De uma olhada nas nossas promoções:");
        System.out.println("                                   ");


        System.out.println("1 - Promoção 1 (Apple) - Pentium Core i3, 8GB RAM, 500GB HD");
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println();

        System.out.println("2 - Promoção 2 (Samsung) - Pentium Core i5, 16GB RAM, 1TB HD");
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println();

        System.out.println("3 - Promoção 3 (Dell) - Pentium Core i7, 32GB RAM, 2TB HD");
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println();

        System.out.println("0 - Finalizar compra");
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println();


        int op;
        do {
            System.out.print("Escolha a promoção desejada: ");
            op = sc.nextInt();

            if(op >= 1 && op <= 3) {
                Computador pc = criarPromocao(op);
                cliente.adicionaComputador(pc);

                System.out.println();
                System.out.println("-------------------------------------------------------------");
                System.out.println();
                System.out.println("---PC adicionado ao carrinho!!---");
                System.out.println();
                System.out.println("-------------------------------------------------------------");
                System.out.println();
            }else if(op !=0){
                System.out.println();
                System.out.println("-------------------------------------------------------------");
                System.out.println();
                System.out.println("--Opcao invalida!--");
                System.out.println();
                System.out.println("-------------------------------------------------------------");
                System.out.println();
            }


        } while(op != 0);
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println();
        System.out.println("--- Resumo da Compra ---");
        cliente.mostraInfo();
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println();
        System.out.println("---Agradecemos pela preferência!---");
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println();

        sc.close();
    }

    private static Computador criarPromocao(int tp) {
        Computador pc = null;
        switch(tp) {
            case 1:
                pc = new Computador("Apple", 2553);
                pc.addHardware(new HardwareBasico("Pentium Core i3", 2200), 0);
                pc.addHardware(new HardwareBasico("Memória RAM", 8), 1);
                pc.addHardware(new HardwareBasico("HD", 500), 2);
                pc.sistema = new SistemaOperacional("Linux Ubuntu", 32);
                pc.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));
                break;

            case 2:
                pc = new Computador("Samsung", 2553 + 1234);
                pc.addHardware(new HardwareBasico("Pentium Core i5", 3370), 0);
                pc.addHardware(new HardwareBasico("Memória RAM", 16), 1);
                pc.addHardware(new HardwareBasico("HD", 1000), 2);
                pc.sistema = new SistemaOperacional("Windows 8", 64);
                pc.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));
                break;

            case 3:
                pc = new Computador("Dell", 2553 + 5678);
                pc.addHardware(new HardwareBasico("Pentium Core i7", 4500), 0);
                pc.addHardware(new HardwareBasico("Memória RAM", 32), 1);
                pc.addHardware(new HardwareBasico("HD", 2000), 2);
                pc.sistema = new SistemaOperacional("Windows 10", 64);
                pc.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));
                break;
        }
        return pc;
    }
}