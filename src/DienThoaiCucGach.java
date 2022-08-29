import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 29/08/2022 2:17 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class DienThoaiCucGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
        while (t-- > 0) {
            String s = sc.next().toLowerCase();
            StringBuilder x = new StringBuilder();
            StringBuilder z = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                String k = Integer.toString(a[s.charAt(i) - 'a']);
                x.append(k);
                z.insert(0, k);
            }
            if (x.toString().compareTo(z.toString()) == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
