package app;

import model.ArCondicionado;
import model.Camera;
import model.FechaduraEletronica;
import model.Lampada;

public class MAin {
    public static void main(String[]args){
        Camera cam = new Camera("samsung", "Japones", false, 20.5, false);
        cam.ligar();
        cam.exibirDados();
        cam.operar();
        cam.operar();
        cam.emitirAlerta();
        cam.conectar();

        System.out.println("====================");

        ArCondicionado ar = new ArCondicionado("LG", "Ryzen 7", false, 1200.0, 19);
        ar.ligar();
        ar.exibirDados();
        ar.operar();
        ar.comandodeVoz();
        ar.conectar();
        ar.exibirDados();

        System.out.println("=========");

        FechaduraEletronica fch = new FechaduraEletronica("intelbras", "Ilumination 5000x", false, 19.0, "12345", false);
        fch.ligar();
        fch.operar();
        fch.desbloquear("12345");
        fch.bloquear();
        fch.exibirDados();

        System.out.println("===============");

        Lampada lamp = new Lampada("Philipão", "Hexa", false, 10.0, 90);
        lamp.ligar();
        lamp.operar();
        lamp.exibirDados();
    }
}
