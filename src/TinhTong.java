import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 29/08/2022 3:05 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long d = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                d += Integer.parseInt(s);
            } catch (Exception ignored) {
            }
        }
        System.out.print(d);
    }
}
