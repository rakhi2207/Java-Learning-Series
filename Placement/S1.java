package Placement;

import java.util.HashMap;

public class S1 {
    public static void main(String[] args)
    {
        int[] a={8,1,4,7,3,2,5,6,9};
        int i=1;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int x=0;x<a.length;x++)
        {
            if(h.getOrDefault(a[x],0)==0)
            {
                h.put(a[x],1);
            }else
            {
               h.put(a[x],h.get(a[x])+1);
            }
        }

        while(true)
        {
            if(h.containsKey(i))
            {
                i++;
            }else
            {
                break;
            }
        }
       if(i>=a.length)
       {
           System.out.println(-1);
       }else
       {
           System.out.println(i);
       }

    }
}
