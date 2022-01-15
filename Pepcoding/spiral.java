package Pepcoding;

public class spiral {
    public static void main(String[] args) {
        int[][] a={{11,12,13,14,15},{21,22,23,24,25},{31,32,33,34,35}};
        int rc=0,lc=0,lbc=a[0].length-1,rbc=a.length-1;
        int tne=a[0].length*a.length;
        int count=0;
       while(tne>count)
       {
           for(int i=rc;i<=rbc&&tne>count;i++)
           {
               System.out.print(a[i][lc]+" ");
               count++;
           }

           lc++;
           for(int i=lc;i<=lbc&&tne>count;i++)
           {
               System.out.print(a[rbc][i]+" ");
               count++;
           }
           rbc--;
           for(int i=rbc;i>=rc&&tne>count;i--)
           {
               System.out.print(a[i][lbc]+" ");
               count++;
           }
           lbc--;
           for(int i=lbc;i>=lc&&tne>count;i--)
           {
               System.out.print(a[rc][i]+" ");
               count++;
           }
           rc++;
       }
    }
}
