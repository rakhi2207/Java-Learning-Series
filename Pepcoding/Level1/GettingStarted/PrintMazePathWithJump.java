package Pepcoding.Level1.GettingStarted;

import java.util.Scanner;

public class PrintMazePathWithJump {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m= scan.nextInt();
        printMazePaths(0,0,n-1,m-1,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr==dr&&sc==dc)
        {
            System.out.println(psf);
            return;
        }
        if(sr>dr|sc>dc)
        {
            return;
        }
        for(int i=1;i<=dc;i++)
        {
            printMazePaths(sr,sc+i,dr,dc,psf+"h"+i);
        }
        for(int i=1;i<=dr;i++)
        {
            printMazePaths(sr+i,sc,dr,dc,psf+"v"+i);
        }
        for(int i=1,j=1;i<=dr&&j<=dc;i++,j++)
        {
            printMazePaths(sr+i,sc+j,dr,dc,psf+"d"+i);
        }
    }
}
