import java.util.Locale;
public class inicio{
    public static void main(String[] args){
        double x=10.35784;
        String Nome="arthur";
        int idade=19;
        double salario=1234.0;
        System.out.printf("%.5f%n", x);
        Locale.setDefault(Locale.US);
        System.out.println("RESULTADO= "+ x + " metros");
        System.out.printf("Apresentar numero %.3f metros%n", x);
        System.out.printf("%s tem %d anos e ganha %.2f no mes%n", Nome, idade, salario );

    }
}