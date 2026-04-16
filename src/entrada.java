import java.util.Locale;
import java.util.Scanner;
public class entrada{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        String x ;
        double y;
        int z;
        System.out.println("Digite algo: ");
        x=sc.next();
        y=sc.nextDouble();
        z=sc.nextInt();
        System.out.println("Você digitou: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
         
        sc.close();
    }
}