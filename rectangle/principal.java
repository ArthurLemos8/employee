import java.util.Scanner; 
import java.util.Locale;
public class principal{
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        retangle r = new retangle();
        r.altura = sc.nextDouble();
        r.largura = sc.nextDouble();
        System.out.println("Area: ");
        System.out.println(r.area());
        System.out.println("Perimetro: " );
        System.out.println(r.perimetro());
        System.out.println("Diagonal");
        System.out.println(r.diagonal());
    }
}