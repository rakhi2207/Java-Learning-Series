package Pepcoding;

public class checkSortedArray {
    public static  boolean getAns(int[] arr,int idx)
    {
        System.out.println(arr.length+" "+idx);
        if(idx>=arr.length-1)
        {
            return true;
        }
        boolean bool=getAns(arr,idx+1);
        if(!bool)
        {
            return bool;
        }
        if(arr[idx]<arr[idx+1])
        {
            return true;
        }else
        {
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(getAns(new int[]{1,2,3,5,4},0));
    }
}
