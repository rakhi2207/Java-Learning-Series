package Placement;


import java.util.ArrayList;
import java.util.Collections;

class Mysort implements Comparable<Mysort>
{
    private String s;
    Mysort(String s)
    {
        this.s=s;
    }
    public String getName()
    {
        return s;
    }
    @Override
    public int compareTo(Mysort o) {
       if (o.getName().length()>this.s.length())
            return -1;
       else if(o.getName().length()<this.s.length())
            return 1;
       else
           return this.getName().compareTo(o.getName());
    }

}
public class S2{
    public static void main(String args[])
    {
        ArrayList<Mysort> a=new ArrayList<>();
        ArrayList f=new ArrayList();
        String[] arr={"China","India","Italy","France","Apppp"};
        for(String i:arr)
        {
            a.add(new Mysort(i));
        }
        Collections.sort(a);
        for(Mysort i:a)
        {
            System.out.println(i.getName());
        }

    }
}
