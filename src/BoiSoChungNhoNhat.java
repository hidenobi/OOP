import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 26/08/2022 4:48 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class BoiSoChungNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.gcd(b);
            BigInteger d = a.multiply(b);
            System.out.println(d.divide(c));
        }
    }
}
