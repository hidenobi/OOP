import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 19/08/2022 9:59 CH
 *
 *
 * */
public class TongUocSo1 {
    public static void main(String[] args) {
        long[] arr = new long[2000006];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i * i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i * i; j < arr.length; j += i) {
                    if (arr[j] == 0) {
                        arr[j] = i;
                    }
                }
            }
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = i;
        }
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            while (n != 1) {
                sum += arr[n];
                n /= arr[n];
            }
        }
        System.out.println(sum);
    }
}
