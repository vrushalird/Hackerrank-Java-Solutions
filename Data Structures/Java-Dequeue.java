    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<Integer>();
            int n = in.nextInt();
            int m = in.nextInt();
            int cnt_un=0;
            HashSet<Integer> s = new HashSet<Integer>();
            for (int i = 0; i < n; i++) 
            {
                int num = in.nextInt();
                deque.add(num);
                s.add(num);

                if (deque.size() == m) {
                    cnt_un = Math.max(s.size(), cnt_un);
                    //remove first item from deque and same from set
                    int item = deque.remove();
                    if (!deque.contains(item)) {
                    s.remove(item);
                    }
                }//--------1 Solution----------*/
               
            }
            System.out.println(""+cnt_un);
            in.close();
            
        }
    }