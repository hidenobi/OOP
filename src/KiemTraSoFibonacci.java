import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class KiemTraSoFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] fiboArray = new long[100];
        fiboArray[0] = 0;
        fiboArray[1] = 1;
        for (int i = 2; i < 93; i++) {
            fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];
        }
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextInt();
            if(binarySearch(fiboArray,n)<0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
