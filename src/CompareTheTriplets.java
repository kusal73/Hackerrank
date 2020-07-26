/*https://www.hackerrank.com/challenges/compare-the-triplets/problem*/
import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        int i;
        int count_a=0,count_b=0;
        for(i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        {
            if(a[i]==b[i]){}
            else if(a[i]>b[i])
                {
                    count_a++;
                }
            else
                {
                    count_b++;
                }
        }
        System.out.println(count_a+" "+count_b);
    }
}
