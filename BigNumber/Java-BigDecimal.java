import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        Arrays.sort(s,new Comparator<Object>(){
            @Override
            public int compare(Object s1, Object s2)
            {
                if(s1 == null || s2 == null)
                    return 0;
                BigDecimal bd1 = new BigDecimal((String)s1);
                BigDecimal bd2 = new BigDecimal((String)s2);
                return bd2.compareTo(bd1);
            }
        });
        
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
