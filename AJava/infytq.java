package AJava;


import java.util.ArrayList;
import java.util.Iterator;

public class infytq {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("Rakhi");a.add("Shivangi");a.add("Vandana");a.add("Aditi");
        for(String s:a)
        {
            System.out.println(s);
        }
        System.out.println("After removal");
        a.remove(0);
        a.remove(a.size()-1);
        for(String s:a)
        {
            System.out.println(s);
        }

        a.set(0,"Rakhi");
       a.add("Aditi");

        Iterator s=a.iterator();
        System.out.println("Modified Iterator");
        while(s.hasNext())
        {
            System.out.println(s.next());
        }
    }
}
