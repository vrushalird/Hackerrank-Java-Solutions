import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    /*public static void printBit(BitSet b)
    {
        int n = b.size();
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            if(b.isEmpty())
            {
                System.out.println("0 0");
            }
            else
            {
                if(b.get(i)==)
                System.out.println(b.get(0)+" "+b.get(1));
            }
        }
    }//*/
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        
        sc.nextLine();
        for(int i=0;i<m;i++)
        {
            String line = sc.next();
            //String[] op = line.split(" ");
            String[] op = new String[2];
            op[0] = sc.next();
            op[1] = sc.next();
            switch (line)
            {
                case "AND": 
                            if(op[0].equals("1") && op[1].equals("1"))
                            {
                                b1.and(b1);
                                //printBit(b1);  
                            }
                            else if(op[0].equals("1") && op[1].equals("2"))
                            {
                                b1.and(b2);
                                //printBit(b2);
                            }
                            else if(op[0].equals("2") && op[1].equals("1"))
                            {
                               b2.and(b1);
                                //printBit(b2);
                            }
                            else
                            {
                                b2.and(b2);
                                //printBit(b2);
                            }//*/
                            break;
                case "OR":  if(op[0].equals("1") && op[1].equals("1"))
                            {
                                b1.or(b1);
                                //printBit(b1);
                            }
                            else if(op[0].equals("1") && op[1].equals("2"))
                            {
                                b1.or(b2);
                                //printBit(b2);
                            }
                            else if(op[0].equals("2") && op[1].equals("1"))
                            {
                               b2.or(b1);
                                //printBit(b2);
                            }
                            else
                            {
                                b2.or(b2);
                                //printBit(b2);
                            }
                            break;
                case "XOR": if(op[0].equals("1") && op[1].equals("1"))
                            {
                                b1.xor(b1);
                                //printBit(b1);
                            }
                            else if(op[0].equals("1") && op[1].equals("2"))
                            {
                                b1.xor(b2);
                                //printBit(b2);
                            }
                            else if(op[0].equals("2") && op[1].equals("1"))
                            {
                                b2.xor(b1);
                                //printBit(b2);
                            }
                            else
                            {
                                b2.xor(b2);
                                //printBit(b2);
                            }
                            break;
                case "FLIP":if(op[0].equals("1"))
                            {
                                b1.flip(Integer.parseInt(op[1]));
                                //printBit(b1);
                               // System.out.println(b1.cardinality()+" "+b2.cardinality());
                            }
                        
                            else
                            {
                                b2.flip(Integer.parseInt(op[1]));
                                //printBit(b2);
                               // System.out.println(b1.cardinality()+" "+b2.cardinality());
                            }
                            break;
                case "SET":if(op[0].equals("1"))
                            {
                                b1.set(Integer.parseInt(op[1]));
                                //printBit(b1);
                               // System.out.println(b1.cardinality()+" "+b2.cardinality());
                            }
                        
                            else
                            {
                                b2.set(Integer.parseInt(op[1]));
                                //printBit(b2);
                               // System.out.println(b1.cardinality()+" "+b2.cardinality());
                            }
                            break;//*/
            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());
        }
    }
}