package Pepcoding;

public class ZeroBack {
    public static void main(String[] args) {
        int[] arr={4,2,4,0,0,3,0,5,1,0};
        int i=0,z=0;
            while (i<arr.length&&z<arr.length)
            {
                if(arr[i]!=0)
                {
                    z++;
                    i++;
                }else if(arr[i]==0)
                {
                    z++;
                }

                if(arr[i]==0&&arr[z]!=0)
                {
                    int temp=arr[i];
                    arr[i]=arr[z];
                    arr[z]=temp;
                }
            }

            for(int m:arr)
            {
                System.out.println(m);
            }
        }
    }