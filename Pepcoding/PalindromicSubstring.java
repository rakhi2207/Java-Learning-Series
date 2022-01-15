package Pepcoding;

import java.util.*;

public class PalindromicSubstring{

    public static boolean isPalindrome(String val)
    {
        int i=0,j=val.length()-1;
        while(i<j)
        {
            if(val.charAt(i)!=val.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static void solution(String str){
        //write your code here
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length()+1;j++)
            {
                String val=str.substring(i,j);
                if(isPalindrome(val))
                {
                    System.out.println(val);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}