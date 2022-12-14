import java.util.Scanner;
import java.util.Vector;

/*
 * @author: Vo Huu Tuan
 * @since: 19/09/2022 2:30 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
class Time {
    int h;
    int m;
    int s;

    void input(Scanner sc) {
        this.h = sc.nextInt();
        this.m = sc.nextInt();
        this.s = sc.nextInt();
    }

    void output() {
        System.out.printf("%d %d %d\n", h, m, s);
    }
}

public class SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Time> v = new Vector<>();
        for (int i = 0; i < n; i++) {
            Time x = new Time();
            x.input(sc);
            v.add(x);
        }
        v.sort((a, b) -> {
            if (a.h == b.h) {
                if (a.m == b.m) {
                    if (a.s > b.s)
                        return 1;
                    else
                        return -1;
                } else if (a.m > b.m)
                    return 1;
                else
                    return -1;
            } else if (a.h > b.h)
                return 1;
            else
                return -1;
        });
        for (int i = 0; i < n; i++)
            v.get(i).output();
    }
}
