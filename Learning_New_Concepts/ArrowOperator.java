package Learning_New_Concepts;

import java.util.ArrayList;
import java.util.Iterator;

public class  ArrowOperator {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1); a.add(2); a.add(3); a.add(4);

        a.forEach(n-> System.out.println(n));

        Iterator s=a.iterator();
        while(s.hasNext())
        {
            System.out.println(s.next());
        }


    }
}
