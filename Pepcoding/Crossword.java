package Pepcoding;

import java.util.Scanner;

public class Crossword {
    public static void solution(char[][] arr, String[] words, int vidx) {
        if(vidx==words.length)
        {
            print(arr);
            return ;
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]=='-'||arr[i][j]==words[vidx].charAt(0))
                {
                    if(horizontallyplaced(arr,i,j,words[vidx]))
                    {
                        boolean[] place=placeHorizontal(arr,i,j,words[vidx]);
                        solution(arr,words,vidx+1);
                        unplaceHorizontal(arr,i,j,words[vidx],place);
                    }
                    if(verticalplaced(arr,i,j,words[vidx]))
                    {
                        boolean[] place=placeVertical(arr,i,j,words[vidx]);
                        solution(arr,words,vidx+1);
                        unplaceVertical(arr,i,j,words[vidx],place);
                    }
                }
            }
        }
    }

    private static void unplaceVertical(char[][] arr, int i, int j, String word, boolean[] place) {
        for(int z=0;z<word.length();z++)
        {
            if(place[z])
            {
                arr[i+z][j]='-';
            }
        }
    }

    private static boolean[] placeVertical(char[][] arr, int i, int j, String word) {
        boolean[] ans=new boolean[word.length()];
        for(int z=0;z<word.length();z++)
        {
            if(arr[i+z][j]=='-')
            {
                arr[i+z][j]=word.charAt(z);
                ans[z]=true;
            }
        }
        return ans;
    }

    private static void unplaceHorizontal(char[][] arr, int i, int j, String word, boolean[] place) {
        for(int z=0;z<word.length();z++)
        {
            if(place[z])
            {
                arr[i][j+z]='-';
            }
        }
    }

    private static boolean[] placeHorizontal(char[][] arr, int i, int j, String word) {
        boolean[] ans=new boolean[word.length()];
        for(int z=0;z<word.length();z++)
        {
            if(arr[i][j+z]=='-')
            {
             arr[i][j+z]=word.charAt(z);
             ans[z]=true;
            }
        }
        return ans;
    }

    private static boolean verticalplaced(char[][] arr, int i, int j, String word) {
       // System.out.println((i+word.length()<arr.length)+" "+ arr.length);
        if((i-1>=0&&arr[i-1][j]!='+')||(i+word.length()<arr.length&&arr[i+word.length()][j]!='+'))
        {
            return false;
        }
        //System.out.println("length "+word.length());
        for(int z=0;z<word.length();z++)
        {
           if(i+z>=arr.length)
           {
               return false;
           }
            if(arr[i+z][j]!='-'&&arr[i+z][j]!=word.charAt(z))
            {
                return false;
            }
        }
        return true;
    }

    private static boolean horizontallyplaced(char[][] arr, int i, int j, String word) {
        if((j-1>=0&&arr[i][j-1]!='+')||(j+word.length()<arr[0].length&&arr[i][j+word.length()]!='+'))
        {
            return false;
        }
        for(int z=0;z<word.length();z++)
        {
            if(j+z>=arr[0].length)
            {
                return false;
            }
            if(arr[i][j+z]!='-'&&arr[i][j+z]!=word.charAt(z))
            {
                return false;
            }
        }
        return true;
    }


    public static void print(char[][] arr) {
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0 ; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[][] arr = new char[10][10];
        for (int i = 0 ; i < arr.length; i++) {
            String str = scn.next();
            arr[i] = str.toCharArray();
        }
        int n = scn.nextInt();
        String[] words = new String[n];
        for (int i = 0 ; i  < words.length; i++) {
            words[i] = scn.next();
        }
        solution(arr, words, 0);
    }
}
