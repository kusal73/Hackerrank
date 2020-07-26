/*https://www.hackerrank.com/challenges/plus-minus/problem*/
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int i;
        int[] count={0,0,0}; //Index[2]->Zero,Index[0]->Positive,Index[1]->Negative
        size=sc.nextInt();
        int[] arr = new int[size];
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==0)
            {
                count[2]++;
            }
            else if(arr[i]>0)
            {
                count[0]++;
            }
            else
            {
                count[1]++;
            }
        }
        for(i=0;i<3;i++)
        {
            System.out.printf("%.6f\n",((float)count[i]/(float)size));
        }


    }
}
