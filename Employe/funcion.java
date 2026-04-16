import java.util.Scanner;
public class funcion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salary s = new Salary();
        System.out.println("Informe o nome: ");
        s.name = sc.nextLine();
        System.out.println("Informe o salario: ");
        s.GroosSalary = sc.nextDouble();
        System.out.println("Informe imposto ");
        s.tax = sc.nextDouble();
        System.out.println("Informe a txa de pocentagem: ");
        double porcentage = sc.nextDouble();
        System.out.println("Salario menos imposto: "+ s.netSalary());
        System.out.println("Salario com a taxa de porcentagem:"+ s.increaseSalary(0));
        s.toString();
    }
}