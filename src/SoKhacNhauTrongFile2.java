import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * @author: Vo Huu Tuan
 * @since: 20/09/2022 11:27 SA
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws IOException {
        DataInputStream dt = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] a = new int[1000];
        for (int i = 0; i < 100000; i++)
            a[dt.readInt()]++;
        for (int i = 0; i < 1000; i++)
            if (a[i] > 0)
                System.out.println(i + " " + a[i]);
        dt.close();
    }
}
