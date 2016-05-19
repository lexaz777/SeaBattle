package com.github.lexaz777.seabattle;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Alex on 20.03.2016.
 */
public class DotCom {
    private  ArrayList<String> locateCells = new ArrayList<String>();
    public boolean isAlive=true;

    public DotCom(int sizeOfShip){
         for (int i=0; i < sizeOfShip; i++){
            locateCells.add(String.valueOf((int) (Math.random()*10)));
        }
    }

    public void checkYourGuess(String Guess){
           int index = locateCells.indexOf(Guess);

           if (index >= 0){
               locateCells.remove(index);
               System.out.println("Попал! ");
           }else System.out.println("Вы промахнулись, пробуйте еще!");

           if (locateCells.isEmpty()){
               isAlive = false;
           }
    }

    public int getShipSize(){
        return locateCells.size();
    }
}
