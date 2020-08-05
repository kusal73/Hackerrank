/*https://www.hackerrank.com/challenges/absolute-permutation/problem*/



import java.util.Scanner;

public class AbsolutePermutation
{
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
            if(k==0) {
                print_array(a);
                System.out.println();
            }
            else {
                if (n % (k * 2) != 0) {
                    System.out.println(-1);
                } else {
                    for (i = 1; i <= n; i = i + (k * 2)) {
                        for (int j = i; j < i + k; j++) {
                            swap(a, j, j + k);
                        }
                    }
                    print_array(a);
                    System.out.println();
                }
            }
        }
    }

    public static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void print_array(int[] a)
    {
        for(int i=1;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

