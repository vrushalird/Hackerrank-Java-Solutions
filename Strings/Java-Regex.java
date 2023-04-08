import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
    String pattern = "([0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[1][\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])."+"([0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[1][\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])."+"([0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[1][\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])."+"([0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[1][\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])";
    
}
