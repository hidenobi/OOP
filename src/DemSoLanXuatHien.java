import java.util.Arrays;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 21/08/2022 1:05 CH
 *
 *
 * */
public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean[] visited = new boolean[n];

            Arrays.fill(visited, false);

            System.out.println("Test " + t + ":");
            for (int i = 0; i < n; i++) {

                if (visited[i])
                    continue;


                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(a[i] + " xuat hien " + count + " lan");
            }

        }
        sc.close();
    }
}
