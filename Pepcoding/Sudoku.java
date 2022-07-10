package Pepcoding;

// import java.io.*;
import java.util.*;

public class Sudoku {
    public static void display(int[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static boolean isValid(int[][] board, int i, int j, int value) {
        for(int rs=0;rs<board[0].length;rs++)
        {
            if(board[i][rs]==value)
            {
                return false;
            }
        }
        for(int rs=0;rs<board.length;rs++)
        {
            if(board[rs][j]==value)
            {
                return false;
            }
        }

        int row=i/3*3;
        int col=j/3*3;
        for(int rs=0;rs<3;rs++)
        {
            for(int cs=0;cs<3;cs++)
            {
                if(board[row+rs][col+cs]==value)
                {
                    return false;
                }
            }
        }
        return true;
    }


    public static void solveSudoku(int[][] board, int i, int j) {
        // write yopur code here
      //  System.out.println(i+" "+j);
        if(i==9)
        {
            display(board);
            return;
        }
        int nr=-1,nc=-1;
        if(j==board[0].length-1)
        {
            nr=i+1;
            nc=0;
        }else {
            nr=i;
            nc=j+1;
        }
        if(board[i][j]!=0)
        {
           solveSudoku(board,nr,nc);
        }else {
            for (int value = 1; value < 10; value++) {
                boolean square = isValid(board, i, j, value);
                if (square) {
                    board[i][j] = value;
                    solveSudoku(board, nr, nc);
                    board[i][j] = 0;
                }
            }
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        solveSudoku(arr, 0, 0);
    }
}

