import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 19/09/2022 2:17 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
class _Fraction {
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
        long a = numerator;
        long b = denominator;
        while (a != 0) {
            long x = a;
            a = b % a;
            b = x;
        }
        numerator /= b;
        denominator /= b;
    }

    _Fraction Add(_Fraction b) {
        _Fraction c = new _Fraction();
        c.denominator = denominator * b.denominator;
        c.numerator = numerator * b.denominator + denominator * b.numerator;
        c.Compact();
        return c;
    }
}
public class TongPhanSo {
    public static void main(String[] args) {
        _Fraction a = new _Fraction();
        _Fraction b = new _Fraction();
        a.Input();
        b.Input();
        _Fraction c = a.Add(b);
        c.Output();
    }
}
