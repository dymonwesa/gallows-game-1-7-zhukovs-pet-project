import java.util.Random;

public class GamePattern {

    private static final int MAX_MISTAKES = 6;

    StringBuffer wordOfPoints = new StringBuffer();
    NumberOfMistakes numberOfMistakes = new NumberOfMistakes();

    private final String randomWord;
    InputLetters inputLetters = new InputLetters();

    Random random = new Random();
    final String[] list = {
            "собака", "кошка", "атмосфера", "диван", "знак", "зеркало"
    };

    public GamePattern() {
        this.randomWord = list[random.nextInt(list.length)];
        this.wordOfPoints.append(getPointsOfLength());
    }

    String getRandomWord() {
        return randomWord;
    }

    public StringBuffer getWordOfPoints() {
        return wordOfPoints;
    }

    boolean compareChars(char a) {
        for (int i = 0; i < randomWord.length(); i++) {
            if (a == randomWord.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    int getLength(String word) {
        return word.length();
    }

    void printResultMove(char a) {
        if (Character.isLetter(a)) {
            if (compareChars(a)) {
                if (!inputLetters.isLetterNew(a)) {
                    System.out.println("Вы уже вводили букву " + a);
                } else {
                    inputLetters.addInputLetter(a);
                    System.out.println("Буква " + a + " есть в слове.");
                    changeLetter(a);
                }
            } else {
                if (!inputLetters.isLetterNew(a)) {
                    System.out.println("Вы уже вводили букву " + a);
                } else {
                    inputLetters.addInputLetter(a);
                    System.out.println("Упс... Буквы " + a + " нет в слове.");
                    numberOfMistakes.setNextCount();
                    System.out.println("Текущее количество ошибок: " + numberOfMistakes.getMistakesCounter());
                    numberOfMistakes.printInfo();
                }
            }
        } else {
            System.out.println("Incorrect input");
        }
        System.out.println(wordOfPoints);
    }

    String getPointsOfLength() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < randomWord.length(); i++) {
            sb.append('*');
        }
        return sb.toString();
    }

    StringBuffer changeLetter(char a) {
        for (int i = 0; i < randomWord.length(); i++) {
            if (randomWord.charAt(i) == a) {
                wordOfPoints.replace(i, i + 1, String.valueOf(a));
            }
        }
        return wordOfPoints;
    }

    boolean isWordGuessed() {
        for (int i = 0; i < wordOfPoints.length(); i++) {
            if (wordOfPoints.charAt(i) == '*') {
                return false;
            }
        }
        return true;
    }

    boolean isLose() {
        return numberOfMistakes.getMistakesCounter() >= MAX_MISTAKES;
    }

}