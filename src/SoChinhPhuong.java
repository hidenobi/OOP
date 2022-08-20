import java.util.Scanner;

import static java.lang.Math.sqrt;

/*
 * @author: Vo Huu Tuan
 * @since: 20/08/2022 10:13 SA
 *
 *
 * */
public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            int n = sc.nextInt();
            int s = (int) sqrt(n);
            if(s*s==n) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
