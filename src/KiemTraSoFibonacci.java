import java.util.ArrayList;
import java.util.Scanner;

public class KiemTraSoFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> fiboArray = new ArrayList<>();
        fiboArray.add(0L);
        fiboArray.add(1L);
        for (int i = 2; i < 93; i++) {
            fiboArray.add(fiboArray.get(fiboArray.size() - 1) + fiboArray.get(fiboArray.size() - 2));
        }
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            if (fiboArray.contains(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
