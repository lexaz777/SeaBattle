package seaBattle;

/**
 * Created by Alex on 26.03.2016.
 */
public class DotComGame {
    public static void main(String Args[]) {
        String myGuess;
        DotCom frigate = new DotCom(3);
        helper help = new helper();
        System.out.println("Давайте сыграем в морской бой! Мы уже создали корабль!");
        for (int i=0;i<frigate.getShipSize();i++){
            System.out.print(frigate.locateCells[i]+" ");
        }
        System.out.println("Попробуйте его потопить!");
        System.out.println("Вводите числа с номерами ячеек от 1 до 10 ");
        while (frigate.isAlive) {
            System.out.print("Введите Ваш вариант - ");
            myGuess = help.readln();
            System.out.println("Вы ввели число = " + myGuess);
            if(frigate.checkYourGuess(myGuess)) {
                System.out.println("Попал!");

            }else System.out.println("Мазила!");

        }
        System.out.println("Утонул");
    }
}