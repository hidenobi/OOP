import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 26/08/2022 4:24 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class UocSoChungLonNhatCuaSoNguyenLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.gcd(b));
        }
        sc.close();
    }
}
