package Pepcoding;

public class CountSort {
    public static void countSort(int[] arr,int max,int min)
    {
        int[] freq=new int[max-min+1];
        for(int i:arr)
        {
            freq[i-min]++;
        }

        int sum=0;
        for(int i=0;i<freq.length;i++)
        {
            sum=sum+freq[i];
            freq[i]=sum-1;
        }

        int[] ans=new int[arr.length];
        for(int i:arr)
        {
            int pos=freq[i-min];
            ans[pos]=i;
            pos=freq[i-min]--;
        }

        for(int i=0;i<ans.length;i++)
        {
            arr[i]=ans[i];
        }
    }

    public static void main(String[] args) {
        int[] arr={1,-1,5,6,7};
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i:arr)
        {
            if(i>max)
            {
                max=i;
            }else if(min>i)
            {
                min=i;
            }
        }

        countSort(arr,max,min);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
