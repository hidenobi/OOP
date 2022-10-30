import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 08/10/2022 5:09 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class LoaiBo100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String str = sc.nextLine();
            int tmp = 3;
            int ans = 0;
            int index = -1;
            while(str.contains("100")){
                if(index==-1) {
                    index = str.indexOf("100");
                    tmp = 3;
                }
                else{
                    int i = str.indexOf("100");
                    if(i==index||i==index-1||i==index-2){
                        tmp+=3;
                    }
                    else {
                        tmp = 3;
                    }
                    ans = Math.max(ans,tmp);
                    index = i;
                }
                str = str.replaceFirst("100","");
            }
            System.out.println(ans);
        }
    }
}
