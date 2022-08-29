import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 29/08/2022 2:50 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int d = 0;
        int[] a = new int[200];
        for (int i = 0; i < s.length(); i++)
            a[s.charAt(i)]++;
        for (int i = 0; i < 200; i++)
            if (a[i] > 0)
                d++;
        System.out.println(d);
        sc.close();
    }
}