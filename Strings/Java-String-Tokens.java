import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if(s.trim().isEmpty())
        {
            System.out.println(0);
           // System.out.println(s);
        }
        else
        {
            String[] split = s.replaceAll("^\\W+","").split("[\\s!,?._'@]+",0);
            System.out.println(split.length);
            for(int i=0;i<split.length;i++)
            {
                System.out.println(split[i]);
            }
        }
        
        scan.close();
    }
}