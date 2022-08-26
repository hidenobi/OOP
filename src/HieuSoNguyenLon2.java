import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 26/08/2022 4:45 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class HieuSoNguyenLon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.subtract(b));
    }
}
