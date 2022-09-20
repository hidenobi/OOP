import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * @author: Vo Huu Tuan
 * @since: 20/09/2022 11:25 SA
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer, Integer> m = new HashMap<>();
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (m.containsKey(n))
                m.put(n, m.get(n) + 1);
            else
                m.put(n, 1);
        }
        Set<Integer> set = m.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + m.get(key));
        }
        sc.close();
    }
}
