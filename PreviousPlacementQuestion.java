import java.util.ArrayList;

public class PreviousPlacementQuestion {
    public static void main(String[] args)
    {
        int[] arr={4,3,2};
        int pxor=0;
        for(int j=0;j<arr.length;j++)
        {
            int freq=(j+1)*(arr.length-j);
            if(freq%2!=0)
            {
                pxor^=arr[j];
            }
        }

        System.out.println(pxor);
//        for(int i:a)
//        {
//            System.out.println(i);
//        }
    }
}
