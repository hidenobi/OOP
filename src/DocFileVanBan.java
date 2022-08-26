import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 26/08/2022 4:53 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class DocFileVanBan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
