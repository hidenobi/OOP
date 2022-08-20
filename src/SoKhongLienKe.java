import java.util.Objects;
import java.util.Scanner;

import static java.lang.Math.abs;

/*
 * @author: Vo Huu Tuan
 * @since: 20/08/2022 9:17 SA
 *
 *
 * */
public class SoKhongLienKe {
    public static boolean isNotAdjacentNumber(String str){
        if(Objects.equals(str, "")) return false;
        int totalDigitNumber = Character.getNumericValue(str.charAt(str.length()-1));
        for(int i=0;i<str.length()-1;i++){
            if(abs(str.charAt(i)-str.charAt(i+1))!=2) return false;
            totalDigitNumber+=(Character.getNumericValue(str.charAt(i)));
        }
        return (totalDigitNumber%10==0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int t=0;t<T;t++){
            String str = sc.nextLine();
            if(isNotAdjacentNumber(str)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
