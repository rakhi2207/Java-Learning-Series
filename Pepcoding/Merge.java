package Pepcoding;

public class Merge {

    public static int[] mergeTwoSortedArray(int[] a,int[] b)
    {
        int i=0,j=0,k=0;
        int[] ans=new int[a.length+b.length];
        while(i<a.length&&j<b.length)
        {
            if(a[i]<b[j])
            {
                ans[k]=a[i];
                i++;
                k++;
            }
            else {
                ans[k] = b[j];
                j++;
                k++;
            }
        }

        while(i<a.length)
        {
            ans[k]=a[i];
            i++;
            k++;
        }

        while (j<b.length)
        {
            ans[k] = b[j];
            j++;
            k++;
        }
        return ans;
    }
    public static int[] merge(int[] arr,int lo,int hi)
    {
        if(lo==hi)
        {
            int[] ans=new int[1];
            ans[0]=arr[lo];
            return ans;
        }

        int mid=(lo+hi)/2;
        int[] ffs=merge(arr,lo,mid);
        int[] bfs=merge(arr,mid+1,hi);
        int[] ans=mergeTwoSortedArray(ffs,bfs);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int[] ans=merge(arr,0,arr.length-1);
        for(int i:ans)
        {
            System.out.println(i);
        }

    }
}
