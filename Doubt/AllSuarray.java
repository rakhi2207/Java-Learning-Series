package Doubt;

import java.util.ArrayList;

public class AllSuarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                ArrayList<Integer> ans=new ArrayList<>();
                for(int k=i;k<=j;k++)
                {
                    ans.add(arr[k]);
                }
                a.add(ans);
            }
        }
        int sum=9;
        for(int j=0;j<a.size();j++)
        {
            ArrayList<Integer> x=a.get(j);
            int sumV=0;
            for(int i:x) {
                sumV+=i;
            }

            if(sumV==sum)
            {
                System.out.println(x);
                break;
            }
        }
        //System.out.println(a);
    }
}
