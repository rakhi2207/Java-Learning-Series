package Learning;

public class StringSubset {
    public static void getSubset(String[] arr,int idx,String ass)
    {
        if(idx<0)
        {
            System.out.println(ass);
            return ;
        }
        String s=arr[idx];
        getSubset(arr,idx-1,ass);
        getSubset(arr,idx-1,s+ass);
    }
    public static void main(String[] args) {
        String s="aa,cc,bb";
        String[] arr=s.split(",");
        getSubset(arr,arr.length-1,"");
    }
}
