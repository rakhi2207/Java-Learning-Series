package Learning;

public class MergeSort {

    public static int[] mergesort(int[] arr,int low,int high)
    {
        if(low==high)
        {
            int[] ans=new int[1];
            ans[0]=arr[low];
            return ans;
        }

            int mid = (low + high) / 2;
            int[] left=mergesort(arr,low,mid);
            int[] right=mergesort(arr,mid+1,high);
            int[] ans=merge(left,right);

            return ans;
    }

    private static int[] merge(int[] left, int[] right) {
        int[] ans=new int[left.length+right.length];
        int i=0,j=0,count=0;
        while(i<left.length&&j<right.length)
        {
            if(left[i]<=right[j])
            {
                ans[count]=left[i];
                i++;
            }else
            {
                ans[count]=right[j];
                j++;
            }
            count++;
        }
        while(i< left.length)
        {
            ans[count]=left[i];
            i++;
            count++;
        }
        while(j< right.length)
        {
            ans[count]=right[j];
            j++;
            count++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans={5,4,3,2,1};
        ans=mergesort(ans,0,ans.length-1);
        for(int i:ans)
        {
            System.out.println(i);
        }

    }
}
