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
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        
        
        for(int i=0;i<n;i++)
        {
            int d = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0;j<d;j++)
            {
                arr.add(sc.nextInt());
            }
            a.add(arr);
        }
        
        int q = sc.nextInt();
        int[][] xy = new int[q][2];
        int x, y;
        for(int i=0;i<q;i++)
        {
            //xy[i][0] = sc.nextInt();
            //xy[i][1] = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            try
            {
                System.out.println(a.get(x-1).get(y-1));
            }catch(IndexOutOfBoundsException e)
            {
                System.out.println("ERROR!");
            } 
        }
        
       
    }
}
