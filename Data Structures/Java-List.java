import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        
        //int[] l = new int[n];
        //l = sc.nextInt().split(" ");
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        
        int q = sc.nextInt();
        sc.nextLine();
        //int x,y;
        for(int i=0;i<2*q;i=i+2)
        {
            String query = sc.nextLine();
            if(query.equals("Insert"))
            {
                String[] l = sc.nextLine().split(" ");
                int x = Integer.parseInt(l[0]);
                int y = Integer.parseInt(l[1]);
                //sc.nextLine();
                list.add(x,y);
            }
            if(query.equals("Delete"))
            {
                int x = Integer.parseInt(sc.nextLine());
                //sc.nextLine();
                //System.out.println(x);
                list.remove(x);
            }
        }
        
        for(int i: list)
        {
            System.out.print(i+" ");
        }
    }
}
