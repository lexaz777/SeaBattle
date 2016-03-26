package seaBattle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alex on 26.03.2016.
 */
public class helper {
    private String newline;
    public String readln(){
       BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
       try {
           newline = a.readLine();
       }
       catch (IOException ex){
            System.out.println(ex);
       }
       return newline;


   }


}
