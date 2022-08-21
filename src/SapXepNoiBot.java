import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 21/08/2022 9:28 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class SapXepNoiBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = n - 1; i >= 0; i--) {
            int s = 0;
            for (int j = 0; j < i; j++) {
                if (a[j + 1] < a[j]) {
                    int k = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = k;
                } else
                    s++;
            }
            if (s == i)
                return;
            System.out.printf("Buoc %d: ", n - i);
            for (int j = 0; j < n; j++)
                System.out.printf("%d ", a[j]);
            System.out.println();
        }
    }
}
