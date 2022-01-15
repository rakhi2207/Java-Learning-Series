package Practice;

import java.util.*;


public class Coins {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr=new int[n];
        long[] ans=new long[n];
        long[] bans=new long[n];
        //count[] c=new count[n];

        HashMap<Integer,ArrayList<Integer>> h=new HashMap<>();


        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            if(h.getOrDefault(arr[i],null)==null)
            {
                ArrayList<Integer> a=new ArrayList<>();
                a.add(i);
                h.put(arr[i],a);
            }else
            {
                ArrayList<Integer> a=h.get(arr[i]);
                a.add(i);
                h.put(arr[i],a);
            }
        }

//        for(int i:h.keySet())
//        {
//            System.out.println(i+" "+h.get(i));
//        }

        Arrays.sort(arr);
        long sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            ans[i]=sum;
        }
        sum=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            sum+=arr[i];
            bans[i]=sum;
        }
//
//
////        for(long i:ans)
////        {
////            System.out.println(i);
////        }
////
////        System.out.println();
////
////        for(long i:bans)
////        {
////            System.out.println(i);
////        }
        boolean check=false;
        for(int i=1;i<arr.length-1;i++)
        {
            if(h.get(arr[i]).size()==1) {
                if (ans[i - 1] == bans[i + 1]) {
                    check = true;
                    System.out.println("YES");
                    break;
                }
            }else
            {
                int ahead=0,next=0;
                for(int a:h.get(arr[i]))
                {
                    if(a<i)
                    {
                        ahead++;
                    }else if(a>i)
                    {
                        next++;
                    }
                }
                if (ans[i - 1]-(arr[i]*ahead) == bans[i + 1]-(arr[i])*next) {
                    check = true;
                    System.out.println("YES");
                    break;
                }
                //System.out.println(arr[i]+" "+ahead+" "+next);
            }
        }

        if(!check)
        {
            System.out.println("NO");
        }
    }
}
