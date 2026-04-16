import java.util.Locale;
public class Atividade{
  public static void main(String[] args){
    String product1= "computer";
    String product2= "Office desk";

    int age=30;
    int code=5290;
    char gender='f';

    double prince1=2100.0;
    double price2=650.50;
    double measure=53.234567;
    System.out.printf("Products: %s, price is %.2f%n", product1, prince1);
    System.out.printf("%s,  wiche price is %.2f%n", product2, price2);
    System.out.printf("Record; %d years old, code %d and gender:%s%n", age, code, gender );
    Locale.setDefault(Locale.US);
    System.out.printf("Us decimal point: %.3f%n", measure);
  }
}