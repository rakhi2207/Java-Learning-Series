package Learning;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Solution {

}
public class check {

    public class Solution {
        static int minimizedMaximumNumber(int n, int k, int a[]) {
            // Write your code here.
            PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
            for(int i:a)
            {
                p.offer(i);
            }
            while(k-->0&&!p.isEmpty())
            {
                int x=p.poll();
                if(x%2==0)
                {
                    p.offer(x/2);
                    p.offer(x/2);
                }
                k--;
            }
            System.out.println(p);
            if(p.isEmpty())
            {
                int min=Integer.MAX_VALUE;
                for(int i:a)
                {
                    if(i<min)
                    {
                        min=i;
                    }
                }
                return min;
            }
            return p.poll();
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
       while(x-->0) {
           int n= scan.nextInt();
           int k=scan.nextInt();
           int[] arr=new int[n];
           for(int i=0;i<n;i++)
           {
               arr[i]= scan.nextInt();
           }

       }
    }
}
