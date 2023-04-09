import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String in_a, in_b;
        in_a = sc.nextLine();
        in_b = sc.nextLine();
        
        //int a, b;
        BigInteger big_a = new BigInteger(in_a);
        BigInteger big_b = new BigInteger(in_b);
        
        System.out.println(big_a.add(big_b));
        System.out.println(big_a.multiply(big_b));
    }
}
