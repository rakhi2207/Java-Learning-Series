package Test;



public class SubstringArrayString {
    public static void getSub(String[] s,String asf,int idx)
    {
        if(idx<0)
        {
            System.out.println(asf);
            return;
        }
        String p=s[idx];
        getSub(s,asf,idx-1);
        getSub(s,p+asf,idx-1);
    }

    public static void main(String[] args) {
        String[] s={"aa","bb","cc","dd"};
        getSub(s,"",s.length-1);
    }
}
