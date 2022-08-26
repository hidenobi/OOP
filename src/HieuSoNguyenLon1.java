import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 26/08/2022 4:30 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class HieuSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.subtract(b);
            c = c.abs();
            int len = Math.max(a.toString().length(), b.toString().length());
            int lenC = c.toString().length();
            if (len > lenC) {
                int l = len - lenC;
                while (l-- > 0) {
                    System.out.print("0");
                }
            }
            System.out.println(c);
        }
    }
}
