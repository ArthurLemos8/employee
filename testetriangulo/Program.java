import java.util.Scanner;
public class Program{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        triangle2 x = new triangle2();
     
        System.out.println("Escreva os 3 numeros: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("valores passados: ");
        System.out.println(x.a);
        System.out.println(x.c);
        System.out.println(x.b);
        double areax = x.calcularArea();
        System.out.println(areax);
        sc.close();
    }
}