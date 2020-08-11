/*https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem*/


import java.util.Scanner;

public class ClimbingTheLeaderboard
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        int i;
        int size=0;
        int temp;
        
        n=sc.nextInt();


        int[] scores = new int[n];

        
        scores[size++]=sc.nextInt();
        
        for(i=1;i<n;i++)
        {   
            temp=sc.nextInt();     
            if(scores[size-1]!=temp)
            {
                scores[size++] =temp;
            }
        }


        m=sc.nextInt();
        int[] alice = new int[m];
        for(i=0;i<m;i++)
        {
            alice[i]=sc.nextInt();
            //temp=alice[i];
            //rank(scores,temp,size);
        }

       /*for( i=0;i<size;i++)
        {
            System.out.print(scores[i]+" ");
        }
        System.out.println();
        for(i=0;i<m;i++)
        {
            System.out.print(alice[i]+" ");
        }*/
        for(i=0;i<m;i++)
        {
            rank(scores,alice[i],size);
        }


    }
    public static void rank(int[] scores,int alice_score,int size)
    {
        if(alice_score>scores[0])
        {
            System.out.println("1");
        }
        else if(alice_score<scores[size-1])
        {
            System.out.println(size+1);
        }
        else
        {
            //System.out.println("really?");
            int low=0;
            int high=size;
            int mid=0;
            while(low<=high)
            {
                mid=(low+high)/2;
                if(scores[mid]==alice_score)
                {
                    System.out.println(mid+1);
                    return;
                }
                else if(alice_score>scores[mid])
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            //System.out.println("mid = "+ mid+", score = "+scores[mid]+", alice score = "+alice_score +", Low = "+low
            //+", High = "+high+", Score low/high = "+scores[low]);
            System.out.println(low+1);

        }
    }
}

