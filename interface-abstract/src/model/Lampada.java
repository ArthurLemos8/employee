package model;

import interfaces.ControleDeVoz;

public class Lampada extends DispositivoInteligente implements ControleDeVoz{
    private int intensidade;

    public Lampada(String marca, String modelo, boolean ligado, Double consumo, int intensidade) {
        super(marca, modelo, ligado, consumo);
        this.intensidade = intensidade;
    }
    @Override
    public void operar(){
        System.out.println("Lampada está iluminando todo o bairro");
    }
    @Override
    public void comandodeVoz(){
        System.out.println("A iluminação foi acesa por comando de voz");
    }
     
}