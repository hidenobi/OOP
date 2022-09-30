import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 26/09/2022 11:34 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class TimSoDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-->0){
            BigInteger bon = new BigInteger("4");
            String s = sc.nextLine();
            BigInteger a = new BigInteger(s);
            if(a.mod(bon).toString().equals("0")){
                System.out.println("4");
            }
            else System.out.println("0");
        }
    }
}
