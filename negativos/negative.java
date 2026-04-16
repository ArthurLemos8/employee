import java.util.Scanner;
public class negative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int []numberRead= new int[number];
        for(int i=0; i<number; i++){
            numberRead[i] = sc.nextInt();

        }
        for( int i =0;i<number;i++){
            if(numberRead[i]<0){
                System.out.println(numberRead[i]);
            }
        }
        sc.close();
    }
}