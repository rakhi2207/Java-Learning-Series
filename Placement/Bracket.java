package Placement;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str= scan.nextLine();
        Stack<Character> ch=new Stack<>();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(')
            {
                ch.add('(');
            }else if(str.charAt(i)==')')
            {
               count++;
            }
        }

        if(ch.size()==count)
        {
            System.out.println("0");
        }else
        {
            System.out.println("1");
        }
    }
}
