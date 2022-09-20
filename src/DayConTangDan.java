import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/*
 * @author: Vo Huu Tuan
 * @since: 20/09/2022 11:34 SA
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class DayConTangDan {
    static int n;
    static int[] a = new int[25];
    static String k;
    static Vector<Integer> x = new Vector<>();
    static Vector<String> v = new Vector<>();
    static Vector<Vector<Integer>> ans = new Vector<>();

    static void Try(int posa) {
        for (int i = posa + 1; i <= n; i++) {
            if (a[i] > a[posa]) {
                Vector<Integer> b = new Vector<>(x);
                b.add(a[i]);
                x.add(a[i]);
                if (x.size() > 1)
                    ans.add(b);
                Try(i);
                x.remove(x.size() - 1);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        a[0] = 0;
        for (int i = 1; i <= n; i++)
            a[i] = sc.nextInt();
        Try(0);
        for (Vector<Integer> an : ans) {
            k = "";
            for (Integer integer : an) k += integer + " ";
            v.add(k);
        }
        Collections.sort(v);
        for (String s : v) System.out.println(s);
        sc.close();
    }
}
