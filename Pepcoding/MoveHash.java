package Pepcoding;

public class MoveHash {
    public static void getAns(String s,String ans)
    {
        if(s.length()==0)
        {
            return ;
        }
        if(s.charAt(0)=='#')
        {
            getAns(s.substring(1),'#'+ans);
        }else
        {
            getAns(s.substring(1),ans+s.charAt(0));
        }
    }

    public static void main(String[] args) {
        String s="Move#Val#";
        String ans=new String("");
        getAns(s,ans);
        System.out.println(ans);
    }
}
