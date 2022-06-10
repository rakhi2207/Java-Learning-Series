package Pepcoding;

import java.util.ArrayList;
import java.util.Arrays;

public class GetMazePathWithJump {
    public static ArrayList<String> gerMazeMath(int sr,int sc,int dr,int dc)
    {
        if(sr==dr&&sc==dc)
        {
            ArrayList<String> pans=new ArrayList<>();
            pans.add("");
            return pans;
        }

        ArrayList<String> hor=new ArrayList<>();
        ArrayList<String> ver=new ArrayList<>();
        ArrayList<String> fans=new ArrayList<>();

            for (int i = 1; i <= dc-sc; i++) {
                hor = gerMazeMath(sr, sc + i, dr, dc);
                for(String s:hor)
                {
                    fans.add("h"+i+s);
                }
            }


            for (int i = 1; i <= dr-sr; i++) {
                ver = gerMazeMath(sr + i, sc, dr, dc);

                for(String s:ver)
                {
                    fans.add("v"+i+s);
                }
            }



        return fans;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(gerMazeMath(0,0,2,2));
    }
}
