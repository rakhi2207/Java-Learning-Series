package TOC;

import java.util.Scanner;

public class LeftRecursion {
    public static void removal(String s)
    {
        String value="";
        int idx=0;
        for(int i=4;i<s.length();i++)
        {
            if(s.charAt(i)=='/')
            {
                idx=i;
               break;
            }else
            {
                value+=s.charAt(i);
            }
        }
        System.out.println("A'->"+value+"A'/E");
        System.out.println("A->"+s.substring(idx+1)+"A'");
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        if(s.charAt(0)==s.charAt(3))
        {
            System.out.println("Left recursion is there");
            removal(s);
        }else
        {
            System.out.println("Left recursion is not there");
        }
    }
}
