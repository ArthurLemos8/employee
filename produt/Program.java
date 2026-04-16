import java.util.Locale;
import  java.util.Scanner;
public class Program{
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        produto p = new produto();
        System.out.println("Nome do produto: ");
        p.name = sc.nextLine();
        System.out.println("Preço: ");
        p.price = sc.nextDouble();
        System.out.println("Quantidade estoque: ");
        p.quantity= sc.nextInt();
        p.toString();
        System.out.println(p.toString());
        sc.close();
    }
}