import java.util.Locale;
import java.util.Scanner;
public class raio{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        double raio, area;
        System.out.println("Informe o valor do raio: ");
        raio=sc.nextDouble();
        area=(raio*raio)*3.14159;
        System.out.printf("Area: %.4f%n",area);
        sc.close();
    }
}