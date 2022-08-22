import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 22/08/2022 3:11 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class SoDep1 {
    public static boolean isCheck(String s) {
        for (int i = 0; i < s.length(); i++) {
            int temp = Character.getNumericValue(s.charAt(i));
            if (temp % 2 != 0) return false;
        }
        StringBuilder str = new StringBuilder(s);
        String tmp = str.reverse().toString();
        return (s.equals(tmp));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            if (isCheck(s)) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}
