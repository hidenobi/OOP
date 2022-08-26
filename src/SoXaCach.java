import java.util.Scanner;

import static java.lang.Math.abs;

/*
 * @author: Vo Huu Tuan
 * @since: 22/08/2022 2:02 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class SoXaCach {

    public static boolean isRightNumber(String ans) {
        for (int i = 0; i < ans.length() - 1; i++) {
            if (abs(ans.charAt(i) - ans.charAt(i + 1)) == 1) return false;
        }
        return true;
    }

    public static void permute(String s, String answer) {
        if (s.length() == 0) {
            if (isRightNumber(answer)) {
                System.out.println(answer);
            }
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = "";
            for (int i = 1; i <= n; i++) {
                str += i;
            }
            permute(str, "");
        }
    }
}
