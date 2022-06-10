package Test;

import java.util.ArrayList;

public class AllSubstring {

    public static void getAllSubstring(String s,ArrayList<String> a)
    {
        for(int i=0;i<s.length();i++)
        {
            String substr="";
            for(int j=i;j<s.length();j++)
            {
                substr+=s.charAt(j);
                a.add(substr);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        String s="abc";
        getAllSubstring(s,a);
        System.out.println(a);
    }
}
