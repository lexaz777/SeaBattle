package seaBattle;

import java.io.IOException;

/**
 * Created by Alex on 20.03.2016.
 */
public class DotCom {
    int[] locateCells;
    private int numOfHits=0;
    public boolean isAlive=true;
    public DotCom(int sizeOfShip){
        locateCells = new int[sizeOfShip];
        for(int i=0;i<locateCells.length;i++){
            locateCells[i]= (int)(Math.random()*10);
        }

    }
    public boolean checkYourGuess(String Guess){
        boolean isHitted=false;

           int numberOfGuess = Integer.parseInt(Guess);
           for (int i = 0; i < locateCells.length; i++) {
               if (locateCells[i] == numberOfGuess) {
                   locateCells[i] = -31337;
                   numOfHits++;
                   isHitted = true;
               }

           }
           if (numOfHits == locateCells.length) {
               isAlive = false;
           }
           return isHitted;
    }
    public int getShipSize(){
        return locateCells.length;
    }

}
