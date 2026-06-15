import java.sql.SQLOutput;
import java.util.Scanner;

public class UIClass {


    void startGame() {
        boolean running = true;
        while(running) {
            System.out.println("\n 1. Начать игру." +
                    "\n 2. Выйти из игры." +
                    "\n");

            Scanner chooseMove = new Scanner(System.in);
            chooseMove.nextInt();
            switch (chooseMove) {
                case 1:
                    GamePattern gamePattern = new GamePattern();
                    String mainWord = gamePattern.getRandomWord();









                    break;

                case 2:
                    System.out.println("Программа завершена");
                    System.exit(0);
                    break;

            }









        }



    }









}
