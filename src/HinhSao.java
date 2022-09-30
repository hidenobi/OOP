import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 26/09/2022 10:03 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class HinhSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[x]++;
            a[y]++;
        }
        for (int i = 1; i <= n; i++) {
            if (a[i] != 1 && a[i] != n - 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.print("Yes");
    }
}
