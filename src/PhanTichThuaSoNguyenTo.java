import java.util.Scanner;

public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            System.out.print("Test " + i + ":");
            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    int count = 0;
                    while (n % j == 0) {
                        n /= j;
                        count++;
                    }
                    System.out.print(" " + j + "(" + count + ")");
                }
            }
            if (n > 1) System.out.print(" " + n + "(1)");
            System.out.println();
        }
    }
}
