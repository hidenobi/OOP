import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 21/08/2022 9:16 CH
 *
 *
 * */
public class BoiSoNhoNhatCuaNSoNguyenDuongDauTien {
    public static long GCD(long a, long b) {
        while (b != 0) {
            long x = a % b;
            a = b;
            b = x;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = 1;
            for (long i = 2; i <= n; i++) {
                long tmp = GCD(k, i);
                k = k * i / tmp;
            }
            System.out.println(k);
        }
        sc.close();
    }
}
