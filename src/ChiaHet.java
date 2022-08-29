import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 29/08/2022 2:55 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if(a.mod(b).toString().equals("0")||b.mod(a).toString().equals("0")){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        sc.close();
    }
}
