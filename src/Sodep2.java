import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 22/08/2022 3:19 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class Sodep2 {
    public static boolean isCheck(String s) {
        int totalDigitNumber = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = Character.getNumericValue(s.charAt(i));
            totalDigitNumber+=temp;
        }
        StringBuilder str = new StringBuilder(s);
        String tmp = str.reverse().toString();
        return (s.charAt(0)=='8' && s.charAt(s.length()-1)=='8'&&totalDigitNumber%10==0&&s.equals(tmp));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            if (isCheck(s)) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}
