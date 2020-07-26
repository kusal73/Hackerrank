/*https://www.hackerrank.com/challenges/diagonal-difference/problem?h_r=next-challenge&h_v=zen*/
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size;
        int i;
        int j;
        int diag1_sum=0;
        int diag2_sum=0;
        int abs_sum;
        size=sc.nextInt();
        int[][] arr=new int[size][size];

        //Taking input
        for(i=0;i<size;i++) {
            for(j=0;j<size;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<size;i++){
            for(j=0;j<size;j++){
                if (i == j){
                    diag1_sum += arr[i][j];
                }
                if (i + j == size - 1) {
                    diag2_sum += arr[i][j];
                }
            }
        }
        abs_sum=Math.abs(diag1_sum-diag2_sum);
        System.out.println(abs_sum);
    }
}
