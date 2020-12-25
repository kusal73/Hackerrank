/*https://www.hackerrank.com/challenges/reduced-string/problem*/
import java.util.*;

public class SuperReducedString {

    /*static String superReducedString(String s) {

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
    }*/

    static String superReducedString(String s) {


        Stack <Character> c = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(c.empty()){
                c.push(s.charAt(i));
            }
            else if(c.peek().equals(s.charAt(i))){
                c.pop();
            }
            else c.push(s.charAt(i));
        }
        String z="";
        if(c.isEmpty()){return "Empty String";}
        else {
            while (!c.empty()) {
                z += c.pop();
            }
            String res = "";
            for (int i = z.length() - 1; i >= 0; i--) {
                res += z.charAt(i);
            }
            return res;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String result=superReducedString(S);
        System.out.println(result);
    }
}
