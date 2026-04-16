
import java.util.Scanner;
public class program{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("certo");
        int [][]mat = new int[m][n];
        System.out.println("Vamos ler a matriz:");
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Number that is in the matriz:");
        int number = sc.nextInt();
         for(int i=0; i<mat[i].length;i++){
            for(int j=0; j<mat.length;j++){
                if(mat[i][j]==number){
                    System.out.println("Position:"+i +","+j );
                
                if(j>0){
                    System.out.println("A esquerda: "+mat[i][j-1]);
                }
                if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
				}
                if(i>0){
                    System.err.println("Em cima: "+mat[i-1][j]);
                }
                if(i<mat.length-1){
                    System.out.println("em baixo: "+mat[i+1][j]);
                }
            }
            }
         }
         sc.close();
    }
}