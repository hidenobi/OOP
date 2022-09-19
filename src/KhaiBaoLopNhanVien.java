import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 19/09/2022 2:23 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
class NhanVien {
    String maNV;
    String ten;
    String gioiTinh;
    String ngaySinh;
    String diaChi;
    String maSoThue;
    String ngayKiHopDong;

    void Input() {
        Scanner sc = new Scanner(System.in);
        maNV = "00001";
        ten = sc.nextLine();
        gioiTinh = sc.next();
        ngaySinh = sc.next();
        sc.nextLine();
        diaChi = sc.nextLine();
        maSoThue = sc.next();
        ngayKiHopDong = sc.next();
    }

    void Output() {
        System.out.printf("%s %s %s %s %s %s %s", maNV, ten, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKiHopDong);
    }
}
public class KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.Input();
        nv.Output();
    }
}
