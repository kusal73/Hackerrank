/*https://www.hackerrank.com/challenges/mini-max-sum/problem?h_r=next-challenge&h_v=zen*/

import java.util.Scanner;
public class BirthdayCakeCandles
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size;
        int i;
        int count=0;
        int max=Integer.MIN_VALUE;
        size=sc.nextInt();
        int[] arr = new int[size];
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(i=0;i<size;i++)
        {
            if(arr[i]==max)
            {
                count++;
            }
        }
        System.out.println(count);

    }
}
