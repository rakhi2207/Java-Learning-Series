package Pepcoding;

public class NQueens {

    public static void getAllpath(int[][] maze,String asf,int row)
    {
      if(row==maze.length)
      {
          System.out.println(asf);
          return;
      }
      for(int col=0;col<maze[0].length;col++)
      {
          if(safeForQueen(maze,row,col)) {
              maze[row][col]=1;
              getAllpath(maze, asf + row + "-" + col + " ", row + 1);
              maze[row][col]=0;
          }
      }
    }

    public static boolean safeForQueen(int[][] maze,int r,int c)
    {

        for(int i=r-1;i>=0;i--)
        {
            if(maze[i][c]==1)
            {
                return false;
            }
        }
        for(int i=r-1,j=c-1;i>=0&&j>=0;i--,j--)
        {
            if(maze[i][j]==1)
            {
                return false;
            }
        }
        for(int i=r-1,j=c+1;i>=0&&j<maze[0].length;i--,j++)
        {
            if(maze[i][j]==1)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] a=new int[4][4];
        getAllpath(a,"",0);

    }
}
