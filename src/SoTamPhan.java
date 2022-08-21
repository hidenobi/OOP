import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 20/08/2022 10:05 SA
 *
 *
 * */
public class SoTamPhan {
    public static boolean isTernaryNumber(long num) {
        String str = Long.toString(num);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1' && str.charAt(i) != '2') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            long num = sc.nextLong();
            if (isTernaryNumber(num)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
