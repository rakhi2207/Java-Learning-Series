package CollegeDSA;

import java.util.HashMap;
import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= scan.nextInt();
        }
        int n1=scan.nextInt();
        int[] b=new int[n1];
        for(int i=0;i<n1;i++)
        {
            b[i]= scan.nextInt();
        }
        if(n==0||n1==0)
        {
            System.out.println(false);
        }else {
            System.out.println(getAns(a, b));
        }
    }
    public static boolean getAns(int[] a,int[] b)
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:b)
        {
            int val=(int)Math.sqrt(i);
            if(h.containsKey(val))
            {
                h.put(val,h.get(val)+1);
            }else
            {
                h.put(val,1);
            }
        }
        for(int i:a)
        {
            if(h.containsKey(i))
            {
                if(h.get(i)==1)
                {
                    h.remove(i);
                }else
                {
                    h.put(i,h.get(i)-1);
                }
            }else
            {
                return false;
            }
        }
        return h.size() <= 0;
    }
}
