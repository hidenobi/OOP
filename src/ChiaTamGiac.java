import java.util.Scanner;

public class ChiaTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            for (int j = 1; j <= n - 1; j++) {
                System.out.printf("%.6f ", h * Math.sqrt((double) j / n));
            }
            System.out.println();
        }
    }
}
