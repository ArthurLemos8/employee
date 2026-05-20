package model;
import interfaces.Conectavel;
import interfaces.ControleDeVoz;
public class ArCondicionado extends DispositivoInteligente implements Conectavel, ControleDeVoz{

    private int temperatura;

    public ArCondicionado(String marca, String modelo, boolean ligado, Double consumo, int temperatura) {
        super(marca, modelo, ligado, consumo);
        this.temperatura = temperatura;
    }

    @Override
    public void operar() {
        System.out.println("Iniciando o resfriamento da sala!");
    }
    @Override
    public void conectar(){
        System.out.println("Dispositivo conectado a internet");
    }
    @Override
    public void desconectar(){
        System.out.println("Dispositivo desconectado da internet");
    }
    @Override
    public void comandodeVoz(){
        System.out.println("Temperatura foi regulada pelo comando de voz");
    }
    
}