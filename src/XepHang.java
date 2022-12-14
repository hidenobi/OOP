import java.util.Scanner;
import java.util.Vector;

/*
 * @author: Vo Huu Tuan
 * @since: 21/09/2022 11:53 SA
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
class _Pair {
    public int t;
    public int d;

    void input(Scanner sc) {
        t = sc.nextInt();
        d = sc.nextInt();
    }
}
public class XepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<_Pair> v = new Vector<>();
        for (int i = 0; i < n; i++) {
            _Pair x = new _Pair();
            x.input(sc);
            v.add(x);
        }
        v.sort((a, b) -> {
            if (a.t > b.t)
                return 1;
            else
                return -1;
        });
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (s < v.get(i).t)
                s = v.get(i).t;
            s += v.get(i).d;
        }
        System.out.println(s);
        sc.close();
    }
}
