import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 20/08/2022 9:30 SA
 *
 *
 * */
public class TinhLuyThua {
    public static long MOD = 1000000007L;

    public static long Power(long n, long k) {
        if (k == 0) return 1L;
        long x = Power(n, k / 2);
        x = (x * x) % MOD;
        if (k % 2 == 0) return x;
        else return (x * n) % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            if (n == 0 && k == 0) break;
            System.out.println(Power(n, k));
        }
        sc.close();
    }
}
