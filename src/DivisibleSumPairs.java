/*https://www.hackerrank.com/challenges/divisible-sum-pairs/problem*/

import java.util.Scanner;
public class DivisibleSumPairs {



        // Complete the divisibleSumPairs function below.
        static int divisibleSumPairs(int n, int k, int[] ar){

            int count=0;
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if((ar[i]+ar[j])% k == 0)
                    {
                        count++;
                    }
                }
            }
            return count;

        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int divisor = sc.nextInt();
            int i;
            int[] arr = new int[size];
            for(i=0;i<size;i++)
            { arr[i]=sc.nextInt();
            }
            int result = divisibleSumPairs(size,divisor,arr);
            System.out.println(result);
        }

    }
