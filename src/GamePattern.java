import java.util.Random;

public class GamePattern {

    StringBuffer wordOfPoints= new StringBuffer();
    NumberOfMistakes numberOfMistakes = new NumberOfMistakes();


    private final String randomWord;
    //---------------------later
    //private StringBuffer usedLettersList = new StringBuffer();


    Random random = new Random();
    final String[] list = {
            "собака"

    };


    public GamePattern(){
        this.randomWord = list[random.nextInt(list.length)];
        this.wordOfPoints.append(getPointsOfLength());
    }

    String getRandomWord(){
        return randomWord;

    }

    public StringBuffer getWordOfPoints() {
        return wordOfPoints;
    }

    boolean compareChars(char a){
        for (int i = 0; i < randomWord.length(); i++)
        {
            if(a == randomWord.charAt(i)) {
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
                System.out.println(changeLetter(a));
            } else {
                System.out.println("Упс... Буквы " + a + " нет в слове.");
                numberOfMistakes.setNextCount();
                System.out.println("Текущее количество ошибок: " + numberOfMistakes.getMistakesCounter());
                numberOfMistakes.printInfo();
            }
        } else {
            System.out.println("Incorrect input");
        }
    }



    String getPointsOfLength(){
        String lineOfPoints = "";
        char p = '*';
        for (int i=0; i<randomWord.length(); i++){
            lineOfPoints += p;
        }
        return lineOfPoints;
    }

    StringBuffer changeLetter(char a) {
        for (int i =0; i<randomWord.length();i++){
            if (randomWord.charAt(i) == a){
                wordOfPoints.replace(i ,i+1, String.valueOf(a));
            }
        }
        return wordOfPoints;
    }










}
