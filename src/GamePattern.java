import java.util.Random;

public class GamePattern {

    Random random = new Random();
    final String[] list = {"корова", "человек", "машина"};

    private String randomWord;

    char inputLetter = ' ';
    char correctLetter = ' ';
    String chosenWord = " ";


    public GamePattern(){
        this.randomWord = list[random.nextInt(list.length)];
    }

    String getRandomWord(){
        return randomWord;

    }

    boolean compareChars(char a){
        for (int i = 0; i < chosenWord.length(); i++)
        {
            if(a == chosenWord.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    int getLength(String word){
        return word.length();
    }

    void printResultMove(char a){
        if (Character.isLetter(a)) {
            if (compareChars(a)) {
                System.out.println("Буква " + a + " есть в слове.");

            } else {
                System.out.println("Упс... Буквы " + a + " нет в слове.");
            }
        } else {
            System.out.println("Incorrect input");
        }
    }






}
