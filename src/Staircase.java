/*https://www.hackerrank.com/challenges/staircase/problem*/


import java.util.Scanner;
public class Staircase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        int i;
        int j;
        int k;
        size=sc.nextInt();
        for(i=0;i<size;i++)
        {
            for(j=size-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=0;k<=i;k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
