import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

/*
 * @author: Vo Huu Tuan
 * @since: 21/09/2022 11:56 SA
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
class MonHoc {
    String maMon;
    String tenMon;
    int soTinCHi;

    void input(Scanner sc) {
        sc.nextLine();
        maMon = sc.nextLine();
        tenMon = sc.nextLine();
        soTinCHi = sc.nextInt();
    }

    void output() {
        System.out.printf("%s %s %d\n", maMon, tenMon, soTinCHi);
    }
}
public class DanhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        Vector<MonHoc> v = new Vector<>();
        for (int i = 0; i < n; i++) {
            MonHoc x = new MonHoc();
            x.input(sc);
            v.add(x);
        }
        v.sort((a, b) -> {
            if (a.tenMon.compareTo(b.tenMon) > 0)
                return 1;
            return -1;
        });
        for (int i = 0; i < n; i++)
            v.get(i).output();
        sc.close();
    }
}
