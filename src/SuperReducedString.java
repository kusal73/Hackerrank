/*https://www.hackerrank.com/challenges/reduced-string/problem*/
import java.util.*;

public class SuperReducedString {

    static String superReducedString(String s) {

        s = s + " ";

        String z = "";

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                i = i + 1;
            } else {
                z += s.charAt(i);
            }
        }

        if (z.equals("") || z.equals(" ")) {
            return "Empty String";
        }
        int flag = 0;
        for (int i = 0; i < z.length() - 1; i++) {
            if (z.charAt(i) == z.charAt(i + 1)) {
                flag = 1;
            }

        }
        if (flag == 0) {
            return z;
        }
        else return superReducedString(z);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String result=superReducedString(S);
        System.out.println(result);
    }
}
