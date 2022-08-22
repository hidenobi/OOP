import java.util.Scanner;
import java.util.Vector;

/*
 * @author: Vo Huu Tuan
 * @since: 21/08/2022 10:05 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class LietKeToHop2 {
    static Vector<Vector<Integer>> ans = new Vector<>();
    static Vector<Integer> tmp = new Vector<>();
    static int count = 0;

    static void makeCombiUtil(int n, int left, int k) {


        if (k == 0) {
            ans.add(tmp);
            for (Integer integer : tmp) {
                System.out.print(integer);
            }
            System.out.print(" ");
            count++;
            return;
        }


        for (int i = left; i <= n; ++i) {
            tmp.add(i);
            makeCombiUtil(n, i + 1, k - 1);

            // Popping out last inserted element
            // from the vector
            tmp.remove(tmp.size() - 1);
        }
    }


    static Vector<Vector<Integer>> makeCombi(int n, int k) {
        makeCombiUtil(n, 1, k);
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ans = makeCombi(n, k);
        System.out.println("\nTong cong co "+count+" to hop");
    }
}
