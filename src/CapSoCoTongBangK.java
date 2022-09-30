import java.util.*;

/*
 * @author: Vo Huu Tuan
 * @since: 26/09/2022 11:05 CH
 * @gmail: dungtuan095@gmail.com
 * @Github: hidenobi
 * */
public class CapSoCoTongBangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            Map<Long,Long> m = new LinkedHashMap<>() ;
            long count = 0L;
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
                if (m.containsKey(a[i]))
                    m.put(a[i], m.get(a[i]) + 1);
                else
                    m.put(a[i], 1L);
            }
            Set<Long> set = m.keySet();
            for (Long key : set) {
                if(key*2==k) count+=m.get(key)*(m.get(key)-1);
                else {
                    if(m.containsKey(k-key)){
                        count+=m.get(key)*m.get(k-key);
                    }
                }
            }
            System.out.println(count/2);
        }
    }
}
