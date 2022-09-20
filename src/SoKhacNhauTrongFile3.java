import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/*
 * @author: Vo Huu Tuan
 * @since: 20/09/2022 11:28 SA
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class SoKhacNhauTrongFile3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> l = (ArrayList<Integer>) ois.readObject();
        int[] a = new int[1000];
        for (Integer i : l)
            a[i]++;
        for (int i = 0; i < 1000; i++)
            System.out.println(i + " " + a[i]);
    }
}
