/*https://www.hackerrank.com/challenges/absolute-permutation/problem*/
//This solutions is Partial and leads to time limit exceed as the recursion gets very large
import java.util.Scanner;

public class AbsolutePermutationPartial
{

    public static int Total=0;
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int test;
        int i;
        test=sc.nextInt();
        while(test-- > 0)
        {
            int n,k;
            n= sc.nextInt();
            k= sc.nextInt();
            int[] a = new int[n+1];
            for(i=1;i<=n;i++)
            {
                a[i]=i;
            }
            perm(a,1,n,n,k);
            if(Total==0)
            {
                System.out.println("-1");
            }
            else
            {
                Total=0;
            }

        }
    }

    static void perm(int a[],int i,int j,int n,int z)
    {
        if(i==j)
        {

            if(check_perm(a,z) && Total==0)
            {
                Total++;
                for (i = 1; i <= n; i++)
                {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }
        else
        {
            for(int k=i;k<=j;k++)
            {
                swap(a, i, k);
                perm(a,i+1,j,n,z);
                swap(a, i, k );

            }
        }
    }
    public static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static boolean check_perm(int a[],int k)
    {
        int i;
        for(i=1;i<a.length;i++)
        {
            if(Math.abs(a[i]-i)!=k)
            {
                return false;
            }
        }
        return true;
    }
}
