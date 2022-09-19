import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 19/09/2022 2:15 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
class Fraction {
    long numerator;
    long denominator;
    static Scanner sc = new Scanner(System.in);

    void Input() {
        numerator = sc.nextLong();
        denominator = sc.nextLong();
    }

    void Output() {
        System.out.printf("%d/%d", numerator, denominator);
    }

    void Compact() {
        Long a = numerator;
        Long b = denominator;
        while (a != 0) {
            Long x = a;
            a = b % a;
            b = x;
        }
        numerator /= b;
        denominator /= b;
    }
}
public class PhanSo {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        a.Input();
        a.Compact();
        a.Output();
    }
}
