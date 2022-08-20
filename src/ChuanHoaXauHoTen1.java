import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 20/08/2022 12:07 SA
 *
 *
 * */
public class ChuanHoaXauHoTen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int test = 0; test < t; test++) {
            String s = sc.nextLine();
            s = s.trim();
            s = s.toLowerCase();
            String[] listStr = s.split("\\s+");
            for (int i = 0; i < listStr.length; i++) {
                if (listStr[i].length() > 0) {
                    String str = listStr[i].substring(0, 1).toUpperCase() + listStr[i].substring(1);
                    if (i != listStr.length - 1) System.out.print(str + " ");
                    else System.out.println(str);
                }

            }
        }
        sc.close();
    }
}
