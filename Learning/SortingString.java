package Learning;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

class myComparator implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        String s= obj1.toString();
        String s1= obj2.toString();
        HashMap<Character,Integer> h=new HashMap<>();
        int count=0,count2=0;
        for(int i=0;i<s.length();i++)
        {
            if(!h.containsKey(s.charAt(i)))
            {
                h.put(s.charAt(i),1);
                count++;
            }
        }
        h.clear();
        for(int i=0;i<s1.length();i++)
        {
            if(!h.containsKey(s1.charAt(i)))
            {
                h.put(s1.charAt(i),1);
                count2++;
            }
        }
        if(count>count2)
        {
            return 1;
        }else if(count<count2)
        {
            return -1;
        }else
        {
            return 0;
        }
    }
}
public class SortingString {
    public static void main(String[] args) {
        String[] s={"abc","efgkk","aabb","bbcccc"};
        Arrays.sort(s,new myComparator());
        for(String s1:s)
        {
            System.out.println(s1);
        }
    }
}
