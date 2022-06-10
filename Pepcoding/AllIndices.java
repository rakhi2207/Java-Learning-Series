package Pepcoding;

public class AllIndices {

    public static int[] allIndices(int[] arr,int idx,int fsf,int k)
    {
        if(idx==arr.length)
        {
            return new int[fsf];
        }

        if(arr[idx]==k)
        {
            int[] val=allIndices(arr,idx+1,fsf+1,k);
            val[fsf]=idx;
        }

        return allIndices(arr,idx+1,fsf,k);
    }
    public static void main(String[] args) {
        int n=6;
        int k=2;
        int[] arr={1,2,2,4,3,2};
        int[] ans=allIndices(arr,0,0,k);
        for(int i:ans)
        {
            System.out.println(i);
        }
    }
}
