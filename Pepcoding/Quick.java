package Pepcoding;

public class Quick {
    public static int partition(int[] arr,int pivot,int lo,int hi)
    {
        int i=lo,j=lo;

        while (i<=hi) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else {
                i++;
            }
        }

        return j-1;
    }

    public static void quickSort(int[] arr,int lo,int hi)
    {
        if(lo>=hi)
        {
            return ;
        }
        int pivot=arr[hi];
        int pi=partition(arr,pivot,lo,hi);
        quickSort(arr,lo,pi-1);
        quickSort(arr,pi+1,hi);
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
