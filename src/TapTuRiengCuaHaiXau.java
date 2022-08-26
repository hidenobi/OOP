import java.util.*;

/*
 * @author: Vo Huu Tuan
 * @since: 22/08/2022 3:27 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            a = a.trim();
            b = b.trim();
            String[] listA = a.split("\\s+");
            String[] listB = b.split("\\s+");
            Set<String> x = new HashSet<>();
            Set<String> y = new HashSet<>();
            for (String s : listA) {
                if (!s.equals("")) x.add(s);
            }
            for (String s : listB) {
                if (!s.equals("")) y.add(s);
            }
            for (String element : x) {
                if (!y.contains(element)) {
                    System.out.printf(element + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
