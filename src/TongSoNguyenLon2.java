import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 21/09/2022 11:45 SA
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class TongSoNguyenLon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.add(b));
        sc.close();
    }
}
