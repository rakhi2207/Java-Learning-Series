package Doubt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class KMP {
    public static void main(String[] args) {
        String s="ababcabcabababd";
        String t="ababk";

        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(0,2,3,4,5));
        for(int i:a)
        {
            System.out.println(i);
        }
//        int[] ct=new int[t.length()];
//        HashMap<Character,Integer> h=new HashMap<>();
//        for(int i=0;i<t.length();i++)
//        {
//            char ch=t.charAt(i);
//            if(h.containsKey(ch))
//            {
//                ct[i]=h.get(ch);
//                h.put(ch,i+1);
//            }else
//            {
//                h.put(t.charAt(i),i+1);
//                ct[i]=0;
//            }
//        }
//       int i=0,j=0;
//        while(j<t.length()&&i<s.length())
//        {
//            if(t.charAt(j)==s.charAt(i))
//            {
//                i++;
//                j++;
//            }else
//            {
//                if(j==0)
//                {
//                    i++;
//                }else
//                {
//                    j=ct[j-1];
//                }
//            }
//        }
//
//        if(j==t.length())
//        {
//            System.out.println("true");
//        }else
//        {
//            System.out.println("false");
//        }
    }
}
