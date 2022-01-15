package Pepcoding;

public class KthLargestElement {

    public static int partiotion(int[] arr,int pivot,int lo,int hi)
    {
        int i=lo,j=lo;
        while (i<=hi)
        {
            if(arr[i]<=pivot)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j++;
            }else
            {
                i++;
            }
        }

        return j-1;
    }

    public static int KthLargest(int[] arr,int lo,int hi,int k)
    {
        int pivot=arr[hi];
        int pi=partiotion(arr,pivot,lo,hi);
        if(pi==k-1)
        {
            return arr[pi];
        }else if(pi>k-1)
        {
            return KthLargest(arr,lo,pi-1,k);
        }else
        {
            return KthLargest(arr,pi+1,hi,k);
        }
    }
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        int k=3;
        System.out.println(KthLargest(arr,0,arr.length-1,k));
    }
}
