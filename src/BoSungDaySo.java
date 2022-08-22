import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 22/08/2022 2:27 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        int MAX = -1;
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            if(element>MAX) MAX = element;
            a.add(element);
        }
        boolean isChecck = false;
        for(int i=1;i<=MAX;i++){
            if(!a.contains(i)){
                isChecck = true;
                System.out.println(i);
            }
        }
        if(!isChecck) System.out.println("Excellent!");
    }
}
