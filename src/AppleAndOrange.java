import java.util.Scanner;

/*https://www.hackerrank.com/challenges/apple-and-orange/problem?h_r=next-challenge&h_v=zen*/
public class AppleAndOrange
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int house_start;
        int house_end;
        int apple_tree;
        int orange_tree;
        int no_of_apples;
        int no_of_oranges;
        int i;
        int apple_count=0;
        int orange_count=0;
        int fell;

        house_start=sc.nextInt();
        house_end=sc.nextInt();
        apple_tree=sc.nextInt();
        orange_tree=sc.nextInt();
        no_of_apples=sc.nextInt();
        no_of_oranges=sc.nextInt();

        int[] apples = new int[no_of_apples];
        int[] oranges = new int[no_of_oranges];

        for(i=0;i<no_of_apples;i++)
        {
            apples[i]=sc.nextInt();
            fell=apples[i]+apple_tree;
            if(fell>=house_start && fell<=house_end)
            {
                apple_count++;
            }
        }
        for(i=0;i<no_of_oranges;i++)
        {
            oranges[i]=sc.nextInt();
            fell=oranges[i]+orange_tree;
            if(fell>=house_start && fell<=house_end)
            {
                orange_count++;
            }
        }
        System.out.println(apple_count);
        System.out.println(orange_count);


    }
}
