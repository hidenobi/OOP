import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 21/08/2022 9:32 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class DiemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            long tmp = 0;
            int ans = -2;
            for (int i = 0; i < n; i++) {
                if (tmp * 2 + a[i] == sum) {
                    ans = i;
                    break;
                }
                tmp += a[i];
            }
            System.out.println(ans + 1);
        }
        sc.close();
    }
}
