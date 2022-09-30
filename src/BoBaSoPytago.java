import java.util.Arrays;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 26/09/2022 10:31 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class BoBaSoPytago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
                a[i]*=a[i];
            }
            Arrays.sort(a);
            int isCheck = 0;
            nameLoop: for(int i=0;i<n-2;i++){
                for(int j=i+1;j<n-1;j++){
                    if(Arrays.binarySearch(a,a[i]+a[j])>=0){
                        System.out.println("YES");
                        isCheck=1;
                        break nameLoop;
                    }
                }
            }
            if(isCheck==0) System.out.println("NO");
        }
    }
}
