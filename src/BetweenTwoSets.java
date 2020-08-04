/*https://www.hackerrank.com/challenges/between-two-sets/problem*/

import java.util.Scanner;
public class BetweenTwoSets
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;

        n=sc.nextInt();
        m=sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];
        int i;
        int j;

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        for(i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }

        int count=0;

        for(j=a[0];j<=b[m-1];j++)
        {
            int flag=0;
            for(i=0;i<n;i++)
            {
               if(j%a[i]!=0)
               {
                    flag=1;
               }
            }
            if(flag==0)
            {
                for (i = 0; i < m; i++)
                {
                    if (b[i]%j!=0)
                    {
                        flag=1;
                    }
                }
                if(flag==0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
