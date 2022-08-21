import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 21/08/2022 9:48 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> b =new ArrayList<>();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(b.size()==0){
                b.add(a[i]);
            }
            else{
                if((b.get(b.size()-1)+a[i])%2==0){
                    b.remove(b.size()-1);
                }
                else b.add(a[i]);
            }
        }
        System.out.println(b.size());
    }
}
