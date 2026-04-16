import java.util.Scanner;
public class atividade1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int vl1, vl2, soma;

        System.out.println("Digite dois valores inteiros: ");
        vl1=sc.nextInt();
        vl2=sc.nextInt();
        soma=vl1+vl2;
        System.out.println("Soma desses valores: "+soma);
        sc.close();

    }
}