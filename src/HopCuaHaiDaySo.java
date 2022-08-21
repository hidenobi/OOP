import java.util.*;

/*
 * @author: Vo Huu Tuan
 * @since: 20/08/2022 10:46 SA
 *
 *
 * */
public class HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            B.add(sc.nextInt());
        }
        ArrayList<Integer> C = new ArrayList<>(A);
        for (Integer element : B) {
            if (!A.contains(element)) C.add(element);
        }
        C.sort(Comparator.comparingInt(a -> a));
        for (int i = 0; i < C.size() - 1; i++) {
            System.out.printf(C.get(i) + " ");
        }
        System.out.printf(String.valueOf(C.get(C.size() - 1)));
        sc.close();
    }
}
