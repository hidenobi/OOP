import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 20/08/2022 9:52 SA
 *
 *
 * */
public class XauNhiPhan {
    public static long[] L = new long[93];
    public static char fibo(int a, long b){
        if(a==1) return '0';
        if(a==2) return '1';
        if(b<=L[a-2]) return fibo(a-2,b);
        return fibo(a-1,b-L[a-2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        L[1]=1;
        L[2]=1;
        for(int i=3;i<93;i++){
            L[i]=L[i-1]+L[i-2];
        }
        for(int t=0;t<T;t++){
            int a = sc.nextInt();
            long b = sc.nextLong();
            System.out.println(fibo(a,b));
        }
        sc.close();
    }
}
