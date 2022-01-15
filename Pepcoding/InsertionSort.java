package Pepcoding;

public class InsertionSort {
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // return true if ith element is smaller than jth element
    public static boolean isSmaller(int[] arr, int i, int j) {
        System.out.println("Comparing " + arr[i] + " and " + arr[j]);
        if (arr[i] < arr[j]) {
            return true;
        } else {
            return false;
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(isSmaller(arr,j,j-1))
                {
                    swap(arr,j,j-1);
                }else
                {
                    break;
                }
            }
        }

        print(arr);
    }
}
