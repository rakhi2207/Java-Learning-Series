package Learning;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Demo {

    public static ArrayList<String> getSubset(String[] arr,int idx)
    {
        if(idx==arr.length)
        {
            ArrayList<String> ans=new ArrayList<>();
            ans.add("");
            return ans;
        }

        String s=arr[idx];
        ArrayList<String> part=getSubset(arr,idx+1);
        ArrayList<String> ans=new ArrayList<>();
        for(String x:part)
        {
            ans.add(x);
            ans.add(s+x);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int r= scan.nextInt();
        scan.nextLine();
        String gets= scan.nextLine();
        String[] s=gets.split(",");
        ArrayList<String> fans=getSubset(s,0);
        Collections.sort(fans, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(fans);
        String z=fans.get(r-1);
        System.out.println(z);
        String val="";
        for(int i=0;i<z.length();i++)
        {
            val+=z.charAt(i)+",";
        }
        System.out.println(val.substring(0,val.length()-1));
    }
}
