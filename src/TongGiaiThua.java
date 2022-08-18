import java.util.Scanner;

/*
* @author: Vo Huu Tuan
* @since: 18/08/2022 10:26 CH
*
*
* */
public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0L;
        long  n = sc.nextLong();
        for(int i=1;i<=n;i++){
            long tmpSum = 1L;
            for(int j=1;j<=i;j++){
                tmpSum*=j;
            }
            sum+=tmpSum;
        }
        System.out.println(sum);
    }
}
