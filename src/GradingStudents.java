/*https://www.hackerrank.com/challenges/grading/problem*/

import java.util.Scanner;
public class GradingStudents
{
    static int nearest_five(int number)
    {
        return number+5-(number%5);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_students;
        int i;
        no_of_students = sc.nextInt();
        int[] marks = new int[no_of_students];
        for (i = 0; i < no_of_students; i++)
        {
            marks[i]=sc.nextInt();
        }

        for(i=0;i<no_of_students;i++)
        {
            if(marks[i]>=38)
            {
                int next_of_five=nearest_five(marks[i]);
                if(next_of_five - marks[i]<3)
                {
                    marks[i]=next_of_five;
                }
            }
            System.out.println(marks[i]);
        }

    }
}
