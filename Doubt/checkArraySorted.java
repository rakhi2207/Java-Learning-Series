package Doubt;

public class checkArraySorted {
    public static boolean sorted(int[] inp,int idx)
    {
        if(idx==inp.length-1)
        {
            return true;
        }
        if(inp[idx]>inp[idx+1])
        {
            return false;
        }
        boolean bool=sorted(inp,idx+1);
        if(!bool)
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={3,4,2,1,5};
        System.out.println(sorted(arr,0));
    }
}
