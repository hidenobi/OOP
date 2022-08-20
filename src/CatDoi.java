import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 18/08/2022 10:33 CH
 *
 *
 * */
public class CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            long ans = 0L;
            String str = sc.next();
            kiem_tra:
            for (int index = 0; index < str.length(); index++) {
                switch (str.charAt(index)) {
                    case '0':
                    case '8':
                    case '9':
                        ans *= 10;
                        break;
                    case '1':
                        ans = ans * 10 + 1;
                        break;
                    default:
                        ans = -1L;
                        break kiem_tra;
                }
            }
            if (ans > 0) System.out.println(ans);
            else System.out.println("INVALID");
        }
        sc.close();
    }
}
