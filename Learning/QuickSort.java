package Learning;

public class QuickSort {
    public static void quick(int[] arr,int low,int high)
    {
        if(low>high)
        {
            return ;
        }
        int pivot=high;
        pivot=partition(arr,low,high,pivot);
        quick(arr,low,pivot-1);
        quick(arr,pivot+1,high);
    }

    private static int partition(int[] arr, int lo,int hi,int pivot) {
        int i=lo,j=lo;
        while(i<=hi&&j<=hi)
        {
            if(arr[i]>arr[pivot])
            {
                i++;
            }else
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
        }
        return j-1;
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        quick(arr,0,arr.length-1);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
