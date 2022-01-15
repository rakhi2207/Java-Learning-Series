package Learning;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListIteratorDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList l=new CopyOnWriteArrayList();
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        Iterator t=l.iterator();
        l.add("D");
        while(t.hasNext())
        {
            Integer i=(Integer) t.next();
            System.out.println(i);
        }
        System.out.println(l);
    }
}
