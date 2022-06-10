package Learning;


import java.util.*;

public class StringAndSubset{

    public static LinkedList<LinkedList<String>> getSubset(String[] arr, int idx)
    {
        if(idx==arr.length-1)
        {
            LinkedList<String> ans=new LinkedList<>();
                ans.add(arr[idx]);
            LinkedList<LinkedList<String>> x=new LinkedList<>();
                x.add(ans);
            return x;
        }

        String s=arr[idx];
        LinkedList<LinkedList<String>> part=getSubset(arr,idx+1);

        LinkedList<LinkedList<String>> ans=new LinkedList<>();
        for(LinkedList<String> x:part)
        {
            ans.add(x);
            LinkedList<String> z = (LinkedList<String>) x.clone();
            z.add(0, s);
            ans.add(z);

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       int r= scan.nextInt();
       scan.nextLine();
        String gets=scan.nextLine();
        String[] s=gets.split(",");
        LinkedList<LinkedList<String>> c=getSubset(s,0);

        Collections.sort(c, new Comparator<LinkedList<String>>() {
            @Override
            public int compare(LinkedList<String> o1, LinkedList<String> o2) {
                return o1.size()-o2.size();
            }
        });

        System.out.println(c.get(r));
    }
}
