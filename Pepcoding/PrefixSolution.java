package Pepcoding;

import java.util.Scanner;
import java.util.Stack;

public class PrefixSolution {
    public static int solve(int value1,int value2,char op)
    {
        switch(op)
        {
            case'+':
                return value1+value2;
            case'-':
                return value1-value2;
            case'*':
                return value1*value2;
            case'/':
                System.out.println(value1 +" "+value2);
                return value1/value2;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        Stack<Integer> value=new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                value.push(Character.getNumericValue(s.charAt(i)));
                System.out.println(value);
            }else
            {
                int val1=value.pop();
                int val2=value.pop();
                value.push(solve(val1,val2,s.charAt(i)));
                System.out.println(value);
            }
        }

        System.out.println(value .pop());

        Stack<String> value1=new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                value1.push(s.charAt(i)+"");
            }else
            {
                String val1=value1.pop();
                String val2=value1.pop();
                char op=s.charAt(i);
                String ans="("+val1+op+val2+")";
                value1.push(ans);
            }
        }
        System.out.println(value1.pop());

        Stack<String> value2=new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                value2.push(s.charAt(i)+"");
            }else
            {
                String val1=value2.pop();
                String val2=value2.pop();
                char op=s.charAt(i);
                String ans=val1+val2+op;
                value2.push(ans);
            }
        }
        System.out.println(value2.pop());
    }
}
