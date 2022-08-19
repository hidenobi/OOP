import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 19/08/2022 10:23 CH
 *
 *
 * */
public class UocSoNguyenToLonNhat {
    public static long UocSo(long n){
        long ans = 0;
        while(n%2==0){
            ans = 2;
            n/=2;
        }
        for(long i=3;i*i<=n;i+=2){
            while(n%i==0){
                ans=i;
                n/=i;
            }
        }
        if(n>1) ans=n;
        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            long n = sc.nextLong();
            System.out.println(UocSo(n));
        }
        sc.close();
    }
}
