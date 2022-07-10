package CollegeDSA;

public class Learning{
    public static void main(String[] args) {
        int[] arr = {10,18,5,1,8,20};
        int n = arr.length;
        int[] sorted_array = mergeSort(arr,0,n-1);
        printArray(sorted_array);
    }
    public static int[] mergeSort(int[] arr,int si,int li){
        if(si == li){
            int[] ba = new int[1];
            ba[0] = arr[si];
            return ba;
        }
        int mid = (si+li)/2;
        int[] left = mergeSort(arr,si,mid);
        int[] right = mergeSort(arr,mid+1,li);
        int[] fa = merge(left,right);
        return fa;
    }

    public static int[] merge(int[] left,int[] right) {
        int[] marr = new int[left.length + right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< left.length && j<right.length){
            if(left[i]<right[j]){
                marr[k] = left[i];
                i++;
            }else {
                marr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i< left.length){
            marr[k] = left[i];
            i++;
            k++;
        }
        while(j< right.length){
            marr[k] = right[j];
            j++;
            k++;
        }
        return marr;
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.print("]");
    }
}