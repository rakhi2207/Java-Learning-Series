package Doubt;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int si=0,ei=0;
        boolean check=false;
        int sum=15;
        for(int i=0;i<arr.length;i++)
        {
            int sumV=0;
            for(int j=i;j<arr.length;j++)
            {
                sumV+=arr[j];
                if(sumV==sum)
                {
                    si=i;
                    ei=j;
                    check=true;
                    break;
                }
            }
            if(check)
            {
                break;
            }
        }

        for(int i=si;i<=ei;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
