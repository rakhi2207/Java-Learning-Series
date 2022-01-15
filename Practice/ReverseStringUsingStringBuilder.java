package Practice;

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        String s="Rakhi";
        StringBuilder str=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            str.append(s.charAt(i));
        }

        System.out.println(str);
    }
}
