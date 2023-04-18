import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;
class Prime{
    void checkPrime(int ... n)
    {
        for(int i=0;i<n.length;i++)
        {
            if(n[i]==1)
                System.out.print("");
            else if(n[i]==2)
                System.out.print(""+2+" ");
            else
            {
                boolean notprime = false;
                for(int j=2;j<n[i]/2+1;j++)
                {
                    if((n[i]%j)==0)
                    {
                        System.out.print(""/*+n[i]+" "*/);
                        notprime = true;
                        //break;
                    }
                   // else
                        
                }  
                if(!notprime)
                    System.out.print(""+n[i]+" ");
            }
             
        }
        System.out.println("");
    }
}
public class Solution {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

