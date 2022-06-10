package Practice;

public class EasymergeSort {

    public static void merge(int[] a,int[] b)
    {
        int[] ans=new int[a.length+b.length];
        int count=0;
        int count1=0;
        int myindex=0;
        while(count<a.length&&count1<b.length)
        {
            if(a[count]<b[count1])
            {
                ans[myindex]=a[count];
                count++;
            }else
            {
                ans[myindex]=b[count1];
                count1++;
            }
            myindex++;
        }


        while(count<a.length)
        {
            ans[myindex]=a[count];
            count++;
            myindex++;
        }
        while(count1<b.length)
        {
            ans[myindex]=b[count1];
            count1++;
            myindex++;
        }

        for(int i:ans)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={1,6,8,9};

        merge(a,b);
    }
}
