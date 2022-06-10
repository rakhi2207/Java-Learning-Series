package Practice;

import java.util.*;
public class binarySearch {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pr=new PriorityQueue<>();
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter the length of array");
//        int n=scan.nextInt();
//        int[] arr=new int[n];
//        System.out.println("Enter the sorted array");
//        for(int i=0;i<n;i++)
//        {
//            arr[i]=scan.nextInt();
//        }
//        System.out.println("Enter the value to be searched");
//        int value=scan.nextInt();
//        int start=0,end=n-1,mid;
//        while(end>=0&&start<=end)
//        {
//            mid=(start+end)/2;
//            if(arr[mid]==value)
//            {
//                System.out.println("ans is "+mid);
//                break;
//            }else if(arr[mid]>value)
//            {
//                end=mid-1;
//            }else
//            {
//                start=mid+1;
//            }
//        }
    }

    public static class ConsistingAtLeast10 {

                static void printSubArrays(int []arr, int start, int end)
                {
                    if (end == arr.length)
                        return;

                        // Increment the end point and start from 0
                    else if (start > end)
                        printSubArrays(arr, 0, end + 1);

                        // Print the subarray and increment the stLarting point
                    else
                    {
                        System.out.print("[");
                        for (int i = start; i < end; i++){
                            System.out.print(arr[i]+", ");
                        }

                        System.out.println(arr[end]+"]");
                        printSubArrays(arr, start + 1, end);
                    }

                    return;
                }
        public static void main(String[] args) {
            int[] arr={1,2,3,4};
            printSubArrays(arr,0,0);
        }
    }

    public static class PrimeChecker {
        static class Val
        {
            int x;
            int y;

            @Override
            public String toString()
            {
                return x+" "+y;
            }
        }
        public static int pow(int x,int pow)
        {
            if(pow==0)
                return 1;
            if(pow%2==0)
            {
                return pow(x*x,pow/2);
            }
            return x*pow(x*x,pow/2);
        }
        public static boolean isPrime(int N)
        {
            for(int i=2;i*i<=N;i++)
            {
                if(N%i==0)
                {
                    return false;
                }
            }
            return true;
        }
        public static int check(int N)
        {
            int val=(int)Math.sqrt(N);
            System.out.println(val);
            ArrayList<Integer> a=new ArrayList<>();

            for(int i=2;i<=val;i++)
            {
                if(isPrime(i))
                {
                    a.add(i);
                }
            }

            ArrayList<Val> h=new ArrayList<>();
            System.out.println("check "+a);
            for(int i=0;i<a.size();i++)
            {
                for(int j=i+1;j<a.size();j++)
                {
                    System.out.println("hello "+(pow(a.get(i),2)+pow(a.get(j),2))+" "+N);
                    if((pow(a.get(i),2)+pow(a.get(j),2))==N)
                    {
                        Val v=new Val();
                        v.x=a.get(i);
                        v.y=a.get(j);
                        //System.out.println(v);
                        h.add(v);
                    }
                }
            }

            if(h.size()==0)
                return -1;
            int min=Integer.MAX_VALUE;
            for(Val v:h)
            {
                if(min>(v.x+v.y))
                {
                    min=v.x+v.y;
                }
            }
            //System.out.println(h);

            return min;
        }
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int N=scan.nextInt();
            System.out.println(check(N));
        }
    }

    public static class dishes {

        static class count
        {
            int li;
            int count=0;
            @Override
            public String toString()
            {
                return li+" "+count;
            }
        }
        public static void main(String[] args) {
            HashMap<Integer, count> h=new HashMap<>();
            int[] ar={1,2,2,2,3,4,2,1};

            for(int i=0;i<ar.length;i++)
            {
                if(h.containsKey(ar[i]))
                {
                    count c=h.get(ar[i]);
                    if(c.li+1!=i)
                    {
                        c.li=i;
                        c.count+=1;
                    }
                }else
                {
                    count c=new count();
                    c.li=i;
                    c.count=1;
                    h.put(ar[i],c);
                }
            }

            int mx=0;
            int val=0;

            for(Integer c:h.keySet())
            {
               count x=h.get(c);
               if(x.count>mx)
               {
                   mx=x.count;
                   val=c;
               }
            }
            System.out.println(val);

        }
    }

    public static class MinimumWithdrawal {
        public static void main(String[] args) {
          int[] arr={3,4,5,6,7,10};
          int val=13;
          int sum=0;

          for(int i:arr)
          {
              sum+=i;
          }
          sum=sum-val;
            System.out.println(sum);
          int cs=0;
          int j=0;

          int sc=0;
          int max=0;
          int i=0;

        while(i<arr.length&&j<arr.length)
        {
              if(cs==sum)
              {
                  sc=i-j+1;
                  max=Math.max(sc,max);
                  cs=cs+arr[i];
              }else if(cs>sum)
              {
                  cs=cs-arr[j];
                  j++;
              }else
              {
                  cs=cs+arr[i];
                  i++;
              }
            System.out.println(i+" "+j+" "+cs+" "+sc);
          }

            System.out.println(arr.length-max);
        }
    }
}
