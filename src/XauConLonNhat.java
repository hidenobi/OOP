import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 20/09/2022 7:11 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class XauConLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        char tmp = 'a';
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)>=tmp){
                tmp = s.charAt(i);
                ans.insert(0, tmp);
            }
        }
        System.out.println(ans);
    }
}
