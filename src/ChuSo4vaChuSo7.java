import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 19/08/2022 10:32 CH
 *
 *
 * */
public class ChuSo4vaChuSo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == '4' || str.charAt(index) == '7') count++;
        }
        if (count == 4 || count == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
