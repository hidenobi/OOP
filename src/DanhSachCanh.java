import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 26/08/2022 9:35 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class DanhSachCanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                x = sc.nextInt();
                if (i <= j && x == 1)
                    System.out.printf("(%d,%d)\n", i, j);
            }
        }
    }
}
