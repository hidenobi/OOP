import java.util.Scanner;
import java.util.Stack;

/*
 * @author: Vo Huu Tuan
 * @since: 26/09/2022 10:06 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            for (int i = n - 1; i >= 0; i--) {
                while (st.size() > 0 && a[st.peek()] <= a[i])
                    st.pop();
                if (st.size() == 0)
                    b[i] = -1;
                else
                    b[i] = a[st.peek()];
                st.push(i);
            }
            for (int i = 0; i < n; i++)
                System.out.print(b[i] + " ");
            System.out.println();
        }
        sc.close();
    }
}
