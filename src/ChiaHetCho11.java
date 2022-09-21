import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 21/09/2022 11:47 SA
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = new BigInteger("11");
            if(a.mod(b).toString().equals("0")){
                System.out.println("1");
            }
            else System.out.println("0");
        }
        sc.close();
    }
}
