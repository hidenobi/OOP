import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

/*
 * @author: Vo Huu Tuan
 * @since: 20/09/2022 11:43 SA
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class ChuanHoaHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true) {
            String s = sc.nextLine();
            if (s.compareTo("END") == 0)
                break;
            Vector<String> a = new Vector<>();
            String x = "";
            s = s.toLowerCase() + " ";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    if (!x.equals("")) {
                        a.add(x);
                        x = "";
                    }
                } else {
                    x += s.charAt(i);
                }
            }
            for (String k : a) {
                System.out.print(k.substring(0, 1).toUpperCase() + k.substring(1) + " ");
            }
            System.out.println();
        }
    }
}
