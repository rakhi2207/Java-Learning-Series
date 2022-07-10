package CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElement {

    public static ArrayList<Integer> kLargest(int input[], int k) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        while(i<k&&i<input.length)
        {
            pq.add(input[i]);
            i++;
        }
        while (i< input.length) {
            if (input[i] <pq.peek()) {
                pq.poll();
                pq.add(input[i]);
            }
            i++;
        }
        while (pq.size()>0)
        {
            ans.add(pq.poll());
        }
        int x=0,y=ans.size()-1;
        while(x<y)
        {
            int temp=ans.get(x);
            ans.set(x,ans.get(y));
            ans.set(y,temp);
            x++;
            y--;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(kLargest(new int[]{2,12,9,16,10,5,3,20,25,11,1,8,6 },4));
    }
}