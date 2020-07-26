/*https://www.hackerrank.com/challenges/simple-array-sum/problem*/
import java.util.*;
public class Simple_array_sum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int size;
        int sum=0;
        size=sc.nextInt();
        int[] a=new int[size];
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
