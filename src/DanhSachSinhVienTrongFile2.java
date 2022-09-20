import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 20/09/2022 11:37 SA
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
class _SV {
    static int id = 1;
    String ten;
    String ns;
    String lop;
    String maSV;
    float GPA;

    void Input(Scanner sc) {
        if (id < 10)
            maSV = "B20DCCN00";
        else if (id < 100)
            maSV = "B20DCCN0";
        else
            maSV = "B20DCCN";
        maSV += Integer.toString(id++);
        sc.nextLine();
        ten = sc.nextLine();
        lop = sc.nextLine();
        ns = sc.nextLine();
        GPA = sc.nextFloat();
        if (ns.charAt(1) == '/')
            ns = '0' + ns;
        if (ns.charAt(4) == '/')
            ns = ns.substring(0, 3) + '0' + ns.substring(3);
    }

    void Output() {
        System.out.printf("%s %s %s %s %.2f\n", maSV, ten, lop, ns, GPA);
    }
}
public class DanhSachSinhVienTrongFile2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            _SV sv = new _SV();
            sv.Input(sc);
            sv.Output();
        }
    }
}
