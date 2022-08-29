import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 29/08/2022 2:44 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            s = s.trim();
            String[] listStr = s.split("\\s+");
            for (String value : listStr) {
                StringBuilder tmp = new StringBuilder(value);
                System.out.printf(tmp.reverse() + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
