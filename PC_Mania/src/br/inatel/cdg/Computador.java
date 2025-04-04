package br.inatel.cdg;

public class Computador {
    public String marca;
    public float preco;
    public HardwareBasico[] hardware;
    public SistemaOperacional sistema;
    public MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
        this.hardware = new HardwareBasico[3]; //Três pois um pro processador, um pra ram e um pro hd
    }
    public void mostraPCConfigs()
    {
        System.out.println("Marca: " + marca);
        System.out.printf("Preço: R$ %.2f%n", preco);

        for (int i = 0; i < hardware.length; i++) {
            if (hardware[i] != null) {
                System.out.println(hardware[i].nome + ": " + hardware[i].capacidade +
                        (hardware[i].nome.contains("RAM") || hardware[i].nome.contains("HD") ? "GB" : "Mhz"));
            }
        }

        System.out.println("Sistema Operacional: " + sistema.nome + " (" + sistema.tipo + " bits)");

        if (memoriaUSB != null) {
            System.out.println("Acompanha: " + memoriaUSB.nome + " de " + memoriaUSB.capacidade + "GB");
        }
    }
    public void addMemoriaUSB (MemoriaUSB musb)
    {
        this.memoriaUSB = musb;
    }
    public void addHardware(HardwareBasico hb, int id)
    {
        this.hardware[id] = hb;
    }
}
