package Practice;

import java.util.*;
public class Anagram{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String value=scan.nextLine();
        System.out.println("Enter a String");
        String value1=scan.nextLine();
        int al[]=new int[256];
        int bl[]=new int[256];
        boolean isAnagram=true;
        if(value.length()==value1.length()) {
            for (int i = 0; i < value.length(); i++) {
                int index = (int) value.charAt(i);
                al[index]++;
            }
            for (int i = 0; i < value1.length(); i++) {
                int index = (int) value1.charAt(i);
                bl[index]++;
            }
            for(int i=0;i<al.length;i++)
            {
                if(al[i]!=bl[i])
                {
                    isAnagram=false;
                    break;
                }
            }
        }
        if(isAnagram) {
            System.out.println("Strings are anagram");
        }else
        {
            System.out.println("Strings are not anagram");
        }
    }

    public static class BeautifulFunction {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            String s=scan.nextLine();
            int count=0;
            while(s.length()>1)
            {
                Integer val=Integer.parseInt(s);
                //System.out.println("check "+val+" "+count);
                count++;
                val++;
                s=val.toString();
                int i=s.length()-1;
                while(i>=0)
                {
                    //System.out.println(s.charAt(i));
                    if(s.charAt(i)=='0')
                    {
                        i--;
                    }else
                    {
                        break;
                    }
                }
                //System.out.println("i is "+i);
                s=s.substring(0,i+1);
            }

            System.out.println(count+9);
        }
    }
}
