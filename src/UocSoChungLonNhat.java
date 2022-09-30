import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 26/09/2022 10:10 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class UocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n+1];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            b[0] = a[0];
            b[n] = a[n-1];
            for(int i=1;i<n;i++){
                BigInteger x = new BigInteger((String.valueOf(a[i])));
                BigInteger y = new BigInteger((String.valueOf(a[i-1])));
                BigInteger z = x.multiply(y).divide(x.gcd(y));
                b[i] = Long.parseLong(z.toString());
            }
            for(int i=0;i<n+1;i++){
                System.out.printf(b[i]+" ");
            }
            System.out.println();
        }
    }
}
