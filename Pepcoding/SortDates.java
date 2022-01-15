package Pepcoding;

public class SortDates {

   public static void countSort(String[] args,int div,int mod,int range)
   {
       int[] freq=new int[range];

       for(String i:args)
       {
           freq[Integer.parseInt(i)/div%mod]++;
       }

       int sum=0;
       for(int i=0;i< freq.length;i++)
       {
           sum=sum+freq[i];
           freq[i]=sum-1;
       }

       String[] ans=new String[args.length];
       for(int i=args.length-1;i>=0;i--)
       {
           int pos=freq[Integer.parseInt(args[i])/div%mod]--;
           ans[pos]=args[i];
       }

       for(int i=0;i< args.length;i++)
       {
           args[i]=ans[i];
       }
   }
    public static void main(String[] args) {
        String[] date={"11081987", "12041989", "12041996","20101996" ,"05061997"};
        //countSort(date,1000000,100,32);
        //countSort(date,10000,100,13);
        countSort(date,1,10000,2501);

        for(String i:date)
        {
            System.out.println(i);
        }
    }
}
