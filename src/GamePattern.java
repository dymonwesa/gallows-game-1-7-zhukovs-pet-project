import java.util.Random;

public class GamePattern {


    Random randomWord = new Random();

    final String[] list = {"корова", "человек", "машина"};

    char inputLetter = ' ';
    char correctLetter = ' ';
    String chosenWord = " ";


    String getRandomWord(){
        return list[randomWord.nextInt(list.length)];

    }





}
