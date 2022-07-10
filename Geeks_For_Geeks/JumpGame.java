package Geeks_For_Geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr={121,200,016};
        Arrays.fill(arr,-1);
        int idx=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]+i==arr.length||arr[i]+i>=idx)
            {
                idx=i;
                arr[i]=idx;
            }else
            {
                arr[i]=idx;
            }
        }
    }
}
