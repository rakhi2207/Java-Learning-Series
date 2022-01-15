package Leetcode;

public class Maximum_swap {
    public static void main(String[] args)
    {
        int num=2736;
        char[] arr=Integer.toString(num).toCharArray();
        int[] idx=new int[arr.length];
        int min=Integer.MIN_VALUE,pos=0;
        for(int i=arr.length-1;i>=0;i--)
        {
             int val=arr[i]-'0';
             if(val>min)
             {
                 min=val;
                 pos=i;
             }
             idx[i]=pos;
        }

        for(int i=0;i<arr.length;i++)
        {
            int val=arr[i]-'0';
            int val1=arr[idx[i]]-'0';
            if(val1>val)
            {
                char temp=arr[i];
                arr[i]=arr[idx[i]];
                arr[idx[i]]=temp;
                break;
            }
        }

        int ans=0;
        for(char i:arr)
        {
            ans=(ans*10)+(i-'0');
        }
        System.out.println(ans);
    }
}
