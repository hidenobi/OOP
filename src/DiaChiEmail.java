import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 22/08/2022 8:59 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> tmp = new ArrayList<>();
        for (int test = 0; test < t; test++) {
            String s = sc.nextLine();
            s = s.trim();
            s = s.toLowerCase();
            String[] listStr = s.split("\\s+");
            String ans = listStr[listStr.length - 1];
            for (int i = 0; i < listStr.length - 1; i++) {
                ans += listStr[i].substring(0, 1);
            }
            tmp.add(ans);
            int count = 0;
            for (String element : tmp) {
                if (element.equals(ans)) count++;
            }
            if (count != 1) ans += count;
            ans += "@ptit.edu.vn";
            System.out.println(ans);
        }
        sc.close();
    }
}
