import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*
 * @author: Vo Huu Tuan
 * @since: 30/09/2022 3:17 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class So0VaSo9 {
    private static final int MAX_COUNT = 100000;
    private static final List<String> vec = new LinkedList<>();
    private static void generateNumberUtil(){
        Queue<String> q = new LinkedList<>();
        q.add("9");
        for(int i = MAX_COUNT;i>0;i--){
            String top = q.peek();
            q.remove();
            vec.add(top);
            q.add(top +"0");
            q.add(top +"9");
        }
    }
    private static String findSmallestMultiple(int n){
        for (String s : vec) {
            if (Integer.parseInt(s) % n == 0) {
                return s;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        generateNumberUtil();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(findSmallestMultiple(n));
        }
        sc.close();
    }
}
