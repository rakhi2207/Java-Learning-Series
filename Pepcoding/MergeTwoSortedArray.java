package Pepcoding;

public class MergeTwoSortedArray {
    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        //write your code here

        int[] ans=new int[a.length+b.length];

        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length)
        {
            if(a[i]<b[j])
            {
                ans[k]=a[i];
                i++;
            }else
            {
                ans[k]=b[j];
                j++;
            }
            k++;
        }

        while(i<a.length)
        {
            ans[k]=a[i];
            i++;
            k++;
        }

        while(j<b.length)
        {
            ans[k]=b[j];
            j++;
            k++;
        }
        return ans;
    }
}
