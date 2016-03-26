package com.github.lexa777757.seabattle;

import java.util.Scanner;

/**
 * Created by Alex on 26.03.2016.
 */
public class DotComGame {
    public static void main(String Args[]) {
        String myGuess;
        DotCom frigate = new DotCom(3);
        Scanner s = new Scanner(System.in);
        System.out.println("Давайте сыграем в морской бой! Мы уже создали корабль!");
        System.out.println("Попробуйте его потопить!");
        System.out.println("Вводите числа с номерами ячеек от 1 до 10 ");
        while (frigate.isAlive) {
            System.out.print("Введите Ваш вариант - ");
            myGuess = s.nextLine();
            System.out.println("Вы ввели число = " + myGuess);
            frigate.checkYourGuess(myGuess);
        }
        System.out.println("Утонул");
    }
}