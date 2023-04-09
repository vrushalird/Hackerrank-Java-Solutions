//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        
        Map<String, Integer> phonebook = new HashMap<String, Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            
            phonebook.put(name, phone);
		}
        
		while(in.hasNext())
		{
			String s=in.nextLine();
            //boolean flag = false;
            //for(Map.Entry me : phonebook.entrySet())
            {
                //if(me.getKey().equals(s))
                if(phonebook.containsKey(s))
                {
                   System.out.println(s+"="+phonebook.get(s));
                   //flag = true;
                   //break; 
                }  
                else
                    System.out.println("Not found");
                    
            }
            //if(flag==false)
               // System.out.println("Not found");
            
                
		}
	}
}
