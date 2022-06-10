package Doubt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

public class PrintSubarray {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        ListIterator<Integer> l=a.listIterator();
        while (l.hasNext())
        {
            l.add(23);
            System.out.println(l.next());
        }
        l=a.listIterator();
        while (l.hasNext())
        {
            System.out.println(l.next());
        }
    }
}
