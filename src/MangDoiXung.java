import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 20/08/2022 10:18 SA
 *
 *
 * */
public class MangDoiXung {
    public static boolean isSymmetricalArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (isSymmetricalArray(arr)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
