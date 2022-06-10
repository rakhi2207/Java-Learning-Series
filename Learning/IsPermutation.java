package Learning;
//
//
//import java.util.HashMap;
//
//public class IsPermutation {
//
//    public static boolean isPermutation(String str1, String str2) {
//        //Your code goes here
//        HashMap<Character,Integer> h=new HashMap<>();
//        for(int i=0;i<str1.length();i++)
//        {
//            if(h.containsKey(str1.charAt(i)))
//            {
//                h.put(str1.charAt(i),h.get(str1.charAt(i))+1);
//            }else
//            {
//                h.put(str1.charAt(i),1);
//            }
//        }
//
//        for(int i=0;i<str2.length();i++)
//        {
//            if(!h.containsKey(str2.charAt(i)))
//            {
//                return false;
//            }
//            h.put(str2.charAt(i),h.get(str2.charAt(i))-1);
//        }
//        for(Character c:h.keySet())
//        {
//            if(h.get(c)!=0)
//            {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isPermutation("abcde","baedc"));
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class IsPermutation{

    static class Pair implements Comparable<Pair>
    {
        int data;
        int size;

        Pair(int data,int size)
        {
            this.data=data;
            this.size=size;
        }

        public int compareTo(Pair o)
        {
            //System.out.println(this.size+" "+o.size);
            if(this.size>o.size)
            {
                return 1;
            }else if(this.size<o.size)
            {
                return -1;
            }else
            {
                return this.data-o.data;
            }
        }
    }
    public static int countOne(int val)
    {
        int count1=0;
        while(val>0)
        {
            if(val%2==1)
            {
                count1++;
            }
            val=val/2;
        }
        return count1;
    }
    public static int[] sortByBits(int[] arr) {
        PriorityQueue<Pair> p=new PriorityQueue<>();

        for(int i=0;i<arr.length;i++)
        {
            Pair ps=new Pair(arr[i],countOne(arr[i]));
            p.add(ps);
        }
        int count=0;
        while(p.size()>0)
        {
            arr[count]=p.poll().data;
            count++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4,5,6,7,8};
       sortByBits(arr);

    }
}