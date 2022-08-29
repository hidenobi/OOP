import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 29/08/2022 2:22 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class XauDoiXung {
    public static int check(String s) {
        int k = 0, n = s.length();
        for (int i = 0; i <= (n - 1) / 2; i++)
            if (s.charAt(i) != s.charAt(n - i - 1))
                k++;
        if ((n % 2 == 0 && k == 1) || (n % 2 == 1 && k <= 1))
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = check(s);
            if (k == 0)
                System.out.println("NO");
            else if (k == 1)
                System.out.println("YES");
        }
        sc.close();
    }
}
