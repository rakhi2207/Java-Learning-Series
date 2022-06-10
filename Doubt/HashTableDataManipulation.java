package Doubt;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class HashTableDataManipulation {
    static class check
    {
        int i=0;
        check(int i)
        {
            this.i=i;
        }
        public int hashCode()
        {
            return i;
        }
        public String toString()
        {
            return i+"";
        }
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(25,1);
        h.put(24,2);
        h.put(33,3);
        h.put(20,4);
        for(int i:h.keySet())
        {
            System.out.println(i);
        }
//        h.put(new check(5),"a");
//        h.put(new check(2),"b");
//        h.put(new check(6),"c");
//        h.put(new check(15),"d");
//        h.put(new check(23),"e");
//        h.put(new check(16),"f");
//        System.out.println(h);
    }
}
