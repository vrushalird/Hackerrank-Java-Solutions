import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        String us, india, china, france;
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        us = nf.format(payment);
        
        NumberFormat ni = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        india = ni.format(payment);
        
        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        china = nf.format(payment);
        
        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        france = nf.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
