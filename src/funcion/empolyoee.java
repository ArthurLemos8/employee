import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class empolyoee {
   public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<funcionarios> list = new ArrayList<>();
        
        System.out.println("How many employees will be registred? ");
        int number = sc.nextInt();
        for (int i=0; i<number; i++){
            System.out.println();
            System.out.println("Employee#"+(i+1)+":");
            System.out.println("id:");
            Integer id = sc.nextInt();
            System.out.println("Name");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("salary: ");
            double salary = sc.nextDouble();
             funcionarios fun = new funcionarios(id, name, salary);
             list.add(fun);
        }
        System.out.println();
        System.out.println("Enter the empolyee id that will have salary increase: ");
        int idsalary = sc.nextInt();
        Integer pos = position(list, idsalary);
        if(pos == null){
            System.out.println("This is does not exist!");
        }
        else{
            System.out.print("Enter the percentage");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }
        System.out.println();
        System.out.println("List of employees:");
        for(funcionarios emp : list){
            System.out.println(emp);
        }

        sc.close();
    }
    public static Integer position(List<funcionarios> list, int id){
        for(int i=0; i<list.size();i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }

        
        return null;
    }
}
