import java.util.Scanner;

import static java.lang.Math.abs;

/*
 * @author: Vo Huu Tuan
 * @since: 20/08/2022 9:01 SA
 *
 *
 * */
public class SoLienKe {
    public static boolean isAdjacentNumber(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (abs(str.charAt(i) - str.charAt(i + 1)) != 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int t = 0; t < T; t++) {
            String str = sc.nextLine();
            if (isAdjacentNumber(str)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
