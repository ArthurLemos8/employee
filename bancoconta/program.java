package bancoconta;
import java.util.Locale;
import java.util.Scanner;
public class program {
    public static void main (String[]args){
         bank bank;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter acount number:");
        int number = sc.nextInt();
        System.out.print("Enter acount holder");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n?");
        char response = sc.next().charAt(0);
        if(response == 'y'){
            System.out.print("Enter intial deposit value: ");
            double initialDeposit= sc.nextDouble();
            bank  = new bank(response, holder, initialDeposit);
        }
        else{
             bank = new bank(response, holder);
        }
        System.out.println();
       
     
        sc.close();
    }
     public String toString(){
            return "bank" 
                    +number
                    +",Holder :"
                    +holder
                    +", Balance: $ "
                    +String.format("%.2f", balance);
        }

}
