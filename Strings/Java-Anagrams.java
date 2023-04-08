import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean flag = false;
        //counting frequency of characters in first string
        int[] freq_a = new int[a.length()];
        char[] char_a = a.toCharArray();
        for(int i=0;i<a.length();i++)
        {
            freq_a[i]=1;
            for(int j=i+1;j<a.length();j++)
            {
                if(Character.toLowerCase(char_a[i])==Character.toLowerCase(char_a[j]))
                {
                    freq_a[i]=freq_a[i]+1;
                    char_a[j]='0';
                }
            }
        }
        //counting frequency of characters in second string
        int[] freq_b = new int[b.length()];
        char[] char_b = b.toCharArray();
        for(int i=0;i<b.length();i++)
        {
            freq_b[i]=1;
            for(int j=i+1;j<b.length();j++)
            {
                if(Character.toLowerCase(char_b[i])==Character.toLowerCase(char_b[j]))
                {
                    freq_b[i]=freq_b[i]+1;
                    char_b[j]='0';
                }
            }
        }
        //compare frequency of both strings characters
        if(char_a.length==char_b.length)
        {
            for(int l=0;l<char_a.length;l++)
            {
                for(int k=0;k<char_b.length;k++)
                {
                    if(char_a[l]!='0' && char_b[k]!='0' && Character.toLowerCase(char_a[l])==Character.toLowerCase(char_b[k]))
                    {
                        if(freq_a[l]==freq_b[k])
                        {
                            flag = true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                }
            }
        }
        else
        {
            return false;
        }
        
        return flag;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
