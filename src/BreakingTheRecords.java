/*https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?h_r=next-challenge&h_v=zen*/


import java.util.Scanner;

public class BreakingTheRecords
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int games_played;
        games_played=sc.nextInt();

        int[] scores= new int[games_played];
        int i;
        for(i=0;i<games_played;i++)
        {
            scores[i]=sc.nextInt();
        }

        int min_count=0;
        int max_count=0;
        int min_score=scores[0];
        int max_score=scores[0];

        for(i=1;i<games_played;i++)
        {
            if(scores[i]>max_score)
            {
                max_score=scores[i];
                max_count++;
            }
            if(scores[i]<min_score)
            {
                min_score=scores[i];
                min_count++;
            }
        }
        System.out.println(max_count+" "+min_count);
    }
}
