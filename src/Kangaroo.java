/*https://www.hackerrank.com/challenges/kangaroo/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen*/

import java.util.Scanner;


public class Kangaroo
{
    //Function to count if X1 and X2 ever reach the same point
    static boolean check_reach(int x1,int v1,int x2,int v2)
    {
        while(x1<x2)
        {
            x1+=v1;
            x2+=v2;
        }
        return x1 == x2;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(); //Position of Kangaroo 1
        int v1 = sc.nextInt(); //Position of Kangaroo 2
        int x2 = sc.nextInt(); //Jump Distance of Kangaroo 1
        int v2 = sc.nextInt(); //Jump Distance of kangaroo 2


        if(x2>x1 && v2>v1)
        {
            System.out.println("NO");
        }
        else
        {
            if(check_reach(x1,v1,x2,v2))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }

    }
}
