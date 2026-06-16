import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class UIClass {


    void startGame() {
        boolean running = true;
        boolean playRunning = true;
        char inputLetter;
        while(running) {
            System.out.println("\n 1. Начать игру." +
                    "\n 2. Выйти из игры." +
                    "\n");

            Scanner scanner = new Scanner(System.in);
            int chooseMove = scanner.nextInt();
            switch (chooseMove) {
                case 1:
                    GamePattern gamePattern = new GamePattern();
                    String mainWord = gamePattern.getRandomWord();
                    System.out.println(mainWord);
                    System.out.println(gamePattern.getPointsOfLength());
                    System.out.println("В заданном слове " + gamePattern.getLength(mainWord) + " букв" );

                    while(playRunning) {
                        System.out.println("Введите букву: ");
                        inputLetter = scanner.next().charAt(0);
                        gamePattern.printResultMove(inputLetter);







                    }








                    break;

                case 2:
                    System.out.println("Программа завершена");
                    System.exit(0);
                    running = false;
                    break;

            }









        }



    }









}
