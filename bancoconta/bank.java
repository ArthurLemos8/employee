package bancoconta;
public class bank{
    private int number;
    private String holder;
    private double balance;

    public bank(int nconta, String nomeTitular, double valorInicial){
        this.number = nconta;
        this.holder = nomeTitular;
        deposit(valorInicial);

    }

    public bank(int nconta, String nomeTitular){
        this.number = nconta;
        this.holder = nomeTitular;

    }

    public double getnumber(){
        return number;
    }
    public void setnomeholder(String nomeTitular){
        this.holder = nomeTitular;
    }
    public String getnomeTitular(){
        return holder;
    }

    public double getvalorInicial(){
        return balance;
    }
    
    public void deposit( double amount){
        balance+=amount;
    }

    public void withdraw(double amount ){
        balance -= amount + 5.0;
    }
}