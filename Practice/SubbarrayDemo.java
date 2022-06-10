package Practice;

public class SubbarrayDemo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
            for(int k=i+1;k<arr.length;k++) {
                for (int j =i; j <=k; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}
