package model;

import interfaces.Conectavel;
import interfaces.EmitirAlerta;

public class Camera extends DispositivoInteligente implements Conectavel, EmitirAlerta {
    private boolean gravando;

    public Camera(String marca, String modelo, boolean ligado, Double consumo, boolean gravando) {
        super(marca, modelo, ligado, consumo);
        this.gravando = gravando;
    }

    @Override
    public void operar() {
        if (!gravando) {
            gravando = true;
            System.out.println("Câmera começou a gravar");
        } else {
            System.out.println("A câmera já está gravando");
        }
    }

    @Override
    public void conectar() {
        System.out.println("Camera conectada a internet");
    }

    @Override
    public void desconectar() {
        System.out.println("Camera desconectada da internet");
    }

    @Override
    public void emitirAlerta() {
        System.out.println("Alerta emitido pela câmera");
    }

}