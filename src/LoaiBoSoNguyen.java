import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/*
 * @author: Vo Huu Tuan
 * @since: 21/09/2022 11:49 SA
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Vector<String> v = new Vector<>();
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                Integer.parseInt(s);
            } catch (Exception x) {
                v.add(s);
            }
        }
        Collections.sort(v);
        for (String s : v) System.out.print(s + " ");
    }
}
