import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 29/08/2022 2:41 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            if (a.compareTo(b) == 0)
                System.out.println(-1);
            else
                System.out.println(Math.max(a.length(), b.length()));
        }
        sc.close();
    }
}
