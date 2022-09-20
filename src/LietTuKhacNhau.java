import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * @author: Vo Huu Tuan
 * @since: 20/09/2022 11:32 SA
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
class WordSet {

    Set<String> set;

    public WordSet(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        set = new TreeSet<>();
        while (sc.hasNext()) {
            set.add(sc.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (String i : set)
            s.append(i).append("\n");
        return s.toString();
    }
}
public class LietTuKhacNhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
