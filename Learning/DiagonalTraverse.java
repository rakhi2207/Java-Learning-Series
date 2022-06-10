package Learning;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        boolean check=false;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(i);
            if(check) {
                int temp = 0;
                for (int j = i; j<arr[0].length&&j >= 0; j--) {
                    System.out.print(arr[temp][j] + " ");
                    System.out.println("temmp "+temp+" "+j);
                    temp++;
                }
                check=false;
            }else
            {
                int temp = i;
                for (int j = 0; j<=i&&j<arr[0].length; j++) {
                    System.out.print(arr[temp][j] + " ");
                    System.out.println("temmp "+temp+" "+j);
                    temp--;
                }
                check=true;
            }
        }


        int ne=1;
        System.out.println("check "+check);
        while (ne<arr[0].length)
        {
            if(check)
            {
                int ti=ne-1,tj=arr[0].length-1;
                while(ti<arr.length)
                {
                    System.out.print(arr[ti][tj]+" ");
                    tj--;
                    ti++;
                }
                check=false;
            }else {
                int tempi = ne, tempj = arr.length - 1;
                while (tempi < arr[0].length) {
                    System.out.print(arr[tempj][tempi] + " ");
                    tempi++;
                    tempj--;
                }
                check=true;
            }
            ne++;
        }
    }
}
