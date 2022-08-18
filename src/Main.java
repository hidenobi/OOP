import java.util.Scanner;

public class Main {
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        for (int i = 2; (long) i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        long n;
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            n = sc.nextLong();
            if (isPrime(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}