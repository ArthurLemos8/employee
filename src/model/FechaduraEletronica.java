package model;

public class FechaduraEletronica extends DispositivoInteligente{
    private String senha;
    private boolean bloqueada;
    public FechaduraEletronica(String marca, String modelo, boolean ligado, Double consumo, String senha, boolean bloqueada) {
        super(marca, modelo, ligado, consumo);
        this.senha = senha;
        this.bloqueada = bloqueada;
    }


    @Override
    public void operar() {
        System.out.println("Fechadura cumprindo seu dever de segurança");
    }
    public void bloquear(){
        bloqueada = true;
        System.out.println("Fechadura bloqueada");
    }
    public void desbloquear(String senhaDigitada){
        if(senha.equals(senhaDigitada)){
            bloqueada = false;
            System.out.println("Tranca destravada, fechadura desbloquada");
        }
        else{
            System.out.println("Senha incorreta!");
        }
    }


}