package CollegeDSA;

import java.util.HashMap;
import java.util.Scanner;

public class fibusingDynamic {
    public static int minimum_pluses(String A){
        String left="",right="";
        int fwd=0,bwd=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)!='=')
            {
                fwd++;
            }else if(A.charAt(i)=='=')
            {
                bwd=fwd+2;
            }
        }
        left=A.substring(0,fwd-1);
        right=A.substring(bwd-1);
        HashMap<String,String> s=new HashMap<>();
        int i=1;
        System.out.println("left is "+left);
        int count=0;
        if(Integer.parseInt(left)==Integer.parseInt(right))
        {
            return count;
        }
        while(i<left.length())
        {
            String ch= left.substring(0,i);
            String ch1=left.substring(i);

            System.out.println(ch+" "+ch1);
            s.put(ch,ch1);
            i++;
        }
        System.out.println(s);
        for(String x:s.keySet())
        {
            System.out.println(x+" "+s.get(x));
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String A;
        A=scan.next();
        int result;
        result = minimum_pluses(A);
        System.out.print(result);
        return ;
    }
}