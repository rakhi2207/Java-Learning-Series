package Practice;

import java.util.*;

public class resolver {
    public static void main(String[] args) {
        int[] arr={6,5,3,2,8,10,9};
        ArrayList<Integer> a=new ArrayList<>();
        PriorityQueue<Integer> h=new PriorityQueue<>();
        h.add(6); h.add(5); h.add(3); h.add(2); h.add(8);h.add(10); h.add(9);
//        for(int i=0;i<arr.length;i++)
//        {
//            h.add(arr[i]);
//        }

        for(int i:h)
        {
            System.out.println(i);
        }
    }
}
