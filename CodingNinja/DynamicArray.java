package CodingNinja;

public class DynamicArray {
   int noOfElement=0;
   int[] data=new int[4];
   public void add(int val)
   {
       if(noOfElement==data.length)
       {
          int[] ans=new int[data.length*2];
          for(int i=0;i<data.length;i++) {
              ans[i] = data[i];
          }
          data=ans;
          data[noOfElement]=val;
          noOfElement++;
       }else{
           data[noOfElement]=val;
           noOfElement++;
       }
   }
   public int get(int idx)
   {
       if(idx>=noOfElement)
       {
           throw  new ArrayIndexOutOfBoundsException();
       }
       else
           return data[idx];
   }

   public void set(int val,int idx)
   {
       if(idx>=noOfElement)
       {
           throw  new ArrayIndexOutOfBoundsException();
       }
       else {
          data[idx]=val;
       }
   }
   public boolean isEmpty()
   {
       return noOfElement==0;
   }
   public int size()
   {
       return noOfElement;
   }
   public void print()
   {
       for(int i=0;i<noOfElement;i++)
       {
           System.out.print(data[i]+" ");
       }
       System.out.println();
   }
   public int removeLast()
   {
       if(noOfElement==0)
       {
           return -1;
       }
       int val=data[noOfElement-1];
       noOfElement--;
       return val;
   }
}
