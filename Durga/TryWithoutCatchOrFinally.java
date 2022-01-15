package Durga;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class TryWithoutCatchOrFinally {
    public static void main(String[] args) throws Exception{

        //This is introduced in 1.7 version where autocloseable resources are accessed inside try without writing catch or finally
            try(FileReader fr=new FileReader("input.txt");BufferedReader br=new BufferedReader(fr))
            {

            }

    }
}
