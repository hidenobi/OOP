import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 29/08/2022 3:04 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class BienSoDep {
    public static int Check(String s) {
        if (s.charAt(1) > s.charAt(0) && s.charAt(2) > s.charAt(1) && s.charAt(3) > s.charAt(2) && s.charAt(4) > s.charAt(3))
            return 1;
        if (s.charAt(1) == s.charAt(0) && s.charAt(2) == s.charAt(1) && s.charAt(4) == s.charAt(3))
            return 1;
        for (int i = 0; i < 5; i++) {
            if (s.charAt(i) != '6' && s.charAt(i) != '8')
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().substring(5).replace(".", "");
            if (Check(s) == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
