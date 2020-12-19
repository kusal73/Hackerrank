//https://www.hackerrank.com/challenges/the-birthday-bar/problem
import java.util.*;

public class SubarrayDivision {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {

        int count=0;
        if(s.size()==1)
        {
            if(s.get(0)==d)
            {
                return 1;
            }
        }
        for (int i = 0; i <= s.size()-m; i++) {
            int sum=0;
            for(int j = 0;j < m;j++){
                sum+=s.get(j+i);
            }
            if(sum == d){
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N");
        int n= sc.nextInt();
        List<Integer> s = new ArrayList();
        for(int i=0;i<n;i++)
        {
            System.out.println("Please enter the Number :");
            s.add(sc.nextInt());
        }
        System.out.println("Enter d:");
        int bday= sc.nextInt();
        System.out.println("Enter m");
        int bmonth= sc.nextInt();
        int result = birthday(s,bday,bmonth);
        System.out.println(result);
    }

}