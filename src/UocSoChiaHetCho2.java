import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 19/08/2022 9:40 CH
 *
 *
 * */
public class UocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int count = 0;
            int k;
            for (k = 1; k * k <= n; k++) {
                if (n % k == 0) {
                    if (k % 2 == 0) {
                        count++;
                    }
                    if ((n / k) % 2 == 0) count++;
                }
            }
            k--;
            if ((k * k == n) && (k % 2 == 0)) count--;
            System.out.println(count);
        }
        sc.close();
    }
}
