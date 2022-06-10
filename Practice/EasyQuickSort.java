package Practice;

public class EasyQuickSort {

    public static void quickSort(int[] arr)
    {
        arr[1]=100;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        quickSort(arr);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
