import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 19/08/2022 7:05 SA
 *
 *
 * */
public class BoiSoChungUocSoChung {
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a, b;
            a = sc.nextLong();
            b = sc.nextLong();
            long tmp = gcd(a, b);
            System.out.println(a * b / tmp + " " + tmp);
        }
        sc.close();
    }
}
