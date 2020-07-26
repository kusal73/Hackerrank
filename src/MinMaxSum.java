/*https://www.hackerrank.com/challenges/mini-max-sum/problem?h_r=next-challenge&h_v=zen*/


import java.util.Scanner;
public class MinMaxSum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[5];
        int i;
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        long min_sum = 0;
        long max_sum = 0;
        for (i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        if(max==min)
        {
            for(i=0;i<4;i++)
            {
                max_sum+=arr[i];
                min_sum+=arr[i];
            }
        }
        else {
            for (i = 0; i < 5; i++) {
                if (arr[i] != min) {
                    max_sum += arr[i];
                }
                if (arr[i] != max) {
                    min_sum += arr[i];
                }
            }
        }
        System.out.println(min_sum+" "+max_sum);
    }

}
