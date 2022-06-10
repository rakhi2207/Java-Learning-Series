package Durga;

import java.util.*;

public class tejus {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String s=scan.nextLine();
        ArrayList<Character> num=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();


        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                a.add(Character.getNumericValue(s.charAt(i)));
            }else
            {
                num.add(s.charAt(i));
            }
        }

       Collections.sort(num);
        Collections.sort(a);

        for(Character i:num)
        {
            System.out.print(i);
        }
        System.out.print(Math.abs(s.indexOf(num.get(0))-s.indexOf(num.get(num.size()-1)))+":");


        int sum=0;
        for(Integer i:a)
        {
            sum=sum+i;
        }
        System.out.print(sum);

        String bb=a.get(0).toString();
        String bb1=a.get(a.size()-1).toString();
        System.out.println(Math.abs(s.indexOf(bb)-s.indexOf(bb1)));
    }
}
