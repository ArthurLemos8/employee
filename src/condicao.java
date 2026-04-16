import java.util.Scanner;
public class condicao{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("digite um número: ");
        n = sc.nextInt();
        String resultado=(n%2==0)? "par": "impar";
        System.out.printf("o numero é: %S\n",resultado);
    }
}