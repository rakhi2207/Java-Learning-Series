package CollegeDSA;

import java.util.ArrayList;

public class PQ {
    // Complete this class
    ArrayList<Integer> heap;
    PQ()
    {
        heap=new ArrayList<>();
    }
    boolean isEmpty() {
        // Implement the isEmpty() function here
        return heap.isEmpty();
    }

    int getSize() {
        // Implement the getSize() function here
        return heap.size();
    }

    int getMax() {
        // Implement the getMax() function here
        if(heap.isEmpty())
        {
            return Integer.MIN_VALUE;
        }
        return heap.get(0);
    }

    void insert(int element) {
        // Implement the insert() function here
        heap.add(element);
        int ci= heap.size()-1;
        int pi=(ci-1)/2;
        while(ci>0)
        {
            if(heap.get(ci)>heap.get(pi))
            {
                int temp=heap.get(ci);
                heap.set(ci,heap.get(pi));
                heap.set(pi,temp);
                ci=pi;
                pi=(ci-1)/2;
            }else
            {
                return ;
            }
        }
    }

    int removeMax() {
        // Implement the removeMax() function here
        int val=heap.remove(0);
        heap.add(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int pi=0;
        while(pi<heap.size())
        {
            int li=2*pi+1;
            int ri=2*pi+2;
            if(li>=heap.size()||ri>= heap.size())
            {
                return val;
            }
            if(heap.get(li)>heap.get(ri))
            {
                int temp=heap.get(pi);
                heap.set(pi,heap.get(li));
                heap.set(li,temp);
                pi=li;
            }else
            {
                int temp=heap.get(pi);
                heap.set(pi,heap.get(ri));
                heap.set(ri,temp);
                pi=ri;
            }
        }
        return val;
    }
}