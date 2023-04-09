import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            if(input == null)
                System.out.println("true");
            else
            {
                Stack s = new Stack<String>();
                int i;
                
                for(i=0;i<input.length();i++)
                {
                   /* if(input.charAt(i)=='(' || input.charAt(i)=='{' || input.charAt(i)=='}')
                    {
                        s.push(input.charAt(i));
                    }*/
                    if(s.isEmpty())
                    {
                        s.push(input.charAt(i));
                    }
                    else
                    {
                       if(input.charAt(i)==')' && s.peek().equals('(') || input.charAt(i)=='}' && s.peek().equals('{') || input.charAt(i)==']' && s.peek().equals('['))
                        {
                            s.pop(); 
                        } 
                        else
                        {
                            s.push(input.charAt(i));
                        }
                    }
                    
                    
                }
                if(s.isEmpty())
                    System.out.println("true");
                else
                    System.out.println("false");   
            }
			
            
            
            
		}
		
	}
}
