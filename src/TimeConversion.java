/*https://www.hackerrank.com/challenges/mini-max-sum/problem?h_r=next-challenge&h_v=zen*/

import java.util.Scanner;
public class TimeConversion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String time;
        time=sc.next();
        //System.out.println(time);
        int hrs=Integer.parseInt(time.substring(0,2));
        int mins=Integer.parseInt(time.substring(3,5));
        int secs=Integer.parseInt(time.substring(6,8));
        String format_12=time.substring(8,10);
        //System.out.println(hrs +"  "+mins +" "+ secs +" "+format_12);
        if(hrs==12  && format_12.compareToIgnoreCase("AM")==0)
        {
            hrs=0;
        }
        else if(hrs==12 && format_12.compareToIgnoreCase("PM")==0)
        {
            hrs=12;
        }
        else if(format_12.compareToIgnoreCase("PM")==0)
        {
            hrs=hrs+12;
        }
        System.out.printf("%02d"+":"+"%02d"+":"+"%02d",hrs,mins,secs);
    }
}
