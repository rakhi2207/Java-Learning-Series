package Placement;

import java.util.Arrays;
import java.util.Scanner;

public class isSumPossible {

    static public int isSum(int[] arr,int N)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            if(arr[i]+arr[j]<N)
            {
                i++;
            }else if(arr[i]+arr[j]>N)
            {
                j--;
            }else
            {
                return 1;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=66;
        int[] arr={18,21,28,31,38,40,60,62};

        Arrays.sort(arr);
        System.out.println(isSum(arr,n));

    }
}
