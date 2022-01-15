package Pepcoding;

import java.util.HashMap;

public class LongestConsecutiveSubstring {
    public static void main(String[] args) {
        String s="aaaaaaaaaa";

        int i=0,count=0,pc=0;

        HashMap<Character,Integer> a=new HashMap<>();
        for(int z=0;z<s.length();z++)
        {
            if(a.containsKey(s.charAt(z)))
            {
                if(count>pc)
                {
                    pc=count;
                }
                while (a.containsKey(s.charAt(z))) {
                    if (count > 0) {
                        count--;
                    }

                    a.remove(s.charAt(i));
                    i++;
                }
            }else
            {
                a.put(s.charAt(z),1);
                count++;
            }
        }
        System.out.println(pc);
    }
}
