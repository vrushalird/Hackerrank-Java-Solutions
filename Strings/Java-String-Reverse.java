import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int flag = 0, j = A.length()-1;
        for(int i=0;i<=A.length()/2;i++,j--)
        {
            if(A.charAt(i)==A.charAt(j))
            {
                flag=1;
            }
            else
            {
                flag=0;
                break;
            }
        }
        if(flag==0)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
