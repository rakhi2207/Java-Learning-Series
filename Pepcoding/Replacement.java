package Pepcoding;

public class Replacement {

    public static void main(String[] args) {
        String s="abababacdefababfgh";
        String c="ab";

        String n=s.replace("ab","X");
        int back=0,ahead=0;
        String ans="XX";
        for(int i=2;i<n.length();i++)
        {
            n=n.replace(ans,"X");
        }
        System.out.println(n);
    }
}
