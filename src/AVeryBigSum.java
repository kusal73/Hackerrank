/*https://www.hackerrank.com/challenges/a-very-big-sum/problem*/
import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        int i;
        long sum=0;
        size=sc.nextInt();
        long[] a=new long[size];
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextLong();
            sum+=a[i];
        }
        System.out.println(sum);

    }
}
