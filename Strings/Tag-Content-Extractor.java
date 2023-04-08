import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        String regex = "(<[^>]*>)";    //regex for tag
        Pattern p = Pattern.compile(regex);
        
		while(testCases>0)
        {
			String line = in.nextLine();
			
          	//Write your code here
			Matcher m = p.matcher(line);
            String prevTag = null;
            int prevTagPos = -1;
            boolean flag = false;
            while(m.find())
            {
                //System.out.println(m.start()+ " "+m.end());
                String tag = line.substring(m.start(),m.end());
                if(tag.charAt(1)!='/')
                {
                    prevTag = tag;
                    prevTagPos = m.end();
                }
                else if (prevTag!=null && tag.charAt(1) == '/')
                {
                    if(prevTag.substring(1).equals(tag.substring(2)) && prevTag.length()>2 && m.start()>prevTagPos+1)
                    {
                        System.out.println(line.substring(prevTagPos,m.start()));
                        flag = true;
                    }
                    /*else
                    {
                        System.out.println("None");
                    }*/
                    prevTag = null;
                }
                
            }
            if(flag)
            {
                System.out.print("");
            }
            else
            {
                System.out.print("None\n");
            }
            //System.out.print(flag?"":"None\n");
			testCases--;
		}
	}
}