import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 22/08/2022 2:47 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class ChuanHoaXauHoTen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int test = 0; test < t; test++) {
            String s = sc.nextLine();
            s = s.trim();
            s = s.toLowerCase();
            String[] listStr = s.split("\\s+");
            for (int i = 1; i < listStr.length; i++) {
                String str = listStr[i].substring(0, 1).toUpperCase() + listStr[i].substring(1);
                if (i != listStr.length - 1) System.out.print(str + " ");
                else System.out.print(str);
            }
            System.out.println(", "+listStr[0].toUpperCase());
        }
        sc.close();
    }
}
