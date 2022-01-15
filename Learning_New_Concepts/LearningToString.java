package Learning_New_Concepts;

import java.util.ArrayList;

public class LearningToString {

    @Override
    public String toString()
    {
        return getClass().getName();
    }
    public static void main(String[] args) {
        String s=new String("Rakhi");
        System.out.println(s);
        Integer i=new Integer(10);
        System.out.println(i);
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(20);
        System.out.println(a);
        LearningToString l=new LearningToString();
        System.out.println(l);
    }
}
