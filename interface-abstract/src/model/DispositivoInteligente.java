package model;

abstract public class DispositivoInteligente {
    private String marca;
    private String modelo;
    private boolean Ligado;
    private Double consumo;

    public DispositivoInteligente(String marca, String modelo, boolean ligado, Double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        Ligado = ligado;
        this.consumo = consumo;
    }

    public void ligar() {
        Ligado = true;
    }

    public void Desligar() {
        Ligado = false;
    }

    public void exibirDados() {

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Consumo: " + consumo);

        if (Ligado) {
            System.out.println("Status: Ligado");
        } else {
            System.out.println("Status: Desligado");
        }
    }

    public abstract void operar();

}