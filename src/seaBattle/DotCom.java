package seabattle;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Alex on 20.03.2016.
 */
public class DotCom {
    private  ArrayList<String> locateCells = new ArrayList<String>();

    public boolean isAlive=true;

    public DotCom(int sizeOfShip){
         for(int i=0;i<sizeOfShip;i++){
            locateCells.add(String.(Math.random()*10));
        }

    }
    public void checkYourGuess(String Guess){

           int numberOfGuess = Integer.parseInt(Guess);

           int index = locateCells.indexOf(numberOfGuess);
           if (index>=0) {
               locateCells.remove(index);
               System.out.println("Попал! ");

           }
           if (locateCells.isEmpty()) {
               isAlive = false;
           }

    }
    public int getShipSize(){
        return locateCells.length;
    }

}
