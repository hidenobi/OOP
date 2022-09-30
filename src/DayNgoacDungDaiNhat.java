import java.util.Scanner;
import java.util.Stack;

/*
 * @author: Vo Huu Tuan
 * @since: 30/09/2022 3:27 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
class mPair<T1, T2> {
    T1 first;
    T2 second;

    mPair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }
}

public class DayNgoacDungDaiNhat {
    private static int timDayNgoacdungDaiNhat(String s) {
        int n = s.length();
        int ans = 0;
        int[] F = new int[n];
        Stack<mPair<Character,Integer>> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)==')'&&!st.empty()&&st.peek().first=='('){
                F[i]=F[i-1];
                if(st.peek().second!=0){
                    F[i]+=F[st.peek().second-1];
                }
                F[i]+=2;
                st.pop();
            }
            else st.push(new mPair<>(s.charAt(i),i));
        }
        for(int i = 0;i<n;i++){
            ans = Math.max(ans,F[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(timDayNgoacdungDaiNhat(s));
        }
        sc.close();
    }
}
