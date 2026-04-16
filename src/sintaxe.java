import java.util.Scanner;
public class sintaxe{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite um número: ");
        int x= sc.nextInt();
        String dia;
        switch(x){
            case 1:
                dia="domingo";
                break;
            case 2:
                dia="Sábado";
                break;
            case 3:
                dia="Segunda";
                break;
            case 4:
                dia="Terça";
                break;
            case 5:
                dia="quarta";
                break;
            case 6:
                dia="quinta";
                break;
            case 7:
                dia="sexta";
                    break;
            default:
                dia="Valor inválido";
                break;
        }
       System.out.println("o dia referido e: "+dia);
       sc.close();
    }
}