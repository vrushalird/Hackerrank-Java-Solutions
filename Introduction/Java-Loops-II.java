import java.util.*;
import java.io.*;
import java.lang.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int s;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            s = a; 
            for(int j=0;j<n;j++)
            {
                s+=b*(Math.pow(2,j));
                System.out.print(s + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
