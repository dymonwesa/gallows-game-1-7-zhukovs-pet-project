public class NumberOfMistakes {


    private int mistakesCounter;


    public NumberOfMistakes(){
        this.mistakesCounter = 0;
    }


    public int getMistakesCounter() {
        return mistakesCounter;
    }

    public void setMistakesCounter(int mistakesCounter) {
        this.mistakesCounter = mistakesCounter;
    }

    public void printInfo(){
        switch (mistakesCounter){
            case 1:
                System.out.println("\n\t|" +"-----------|" +
                                    "\n\t|" +"           |" +
                        "\n\t|" +
                        "\n\t|" +
                        "\n\t|" +
                        "\n\t|" +
                        "\n\t|" +"\\");
                break;
            case 2:
                System.out.println("\n\t|" +"-----------|" +
                        "\n\t|" +"           0" +
                        "\n\t|" +"           |" +
                        "\n\t|" +"           |" +
                        "\n\t|" +"           |" +
                        "\n\t|" +
                        "\n\t|" +"\\");
                break;
            case 3:
                System.out.println("\n\t|" +"-----------|" +
                        "\n\t|" +"           0" +
                        "\n\t|" +"           |\\" +
                        "\n\t|" +"           |" +
                        "\n\t|" +"           |" +
                        "\n\t|" +
                        "\n\t|" +"\\");
                break;
            case 4:
                System.out.println("\n\t|" +"-----------|" +
                        "\n\t|" +"           0" +
                        "\n\t|" +"          /|\\" +
                        "\n\t|" +"           |" +
                        "\n\t|" +"           |" +
                        "\n\t|" +
                        "\n\t|" +"\\");
                break;
            case 5:
                System.out.println("\n\t|" +"-----------|" +
                        "\n\t|" +"           0" +
                        "\n\t|" +"          /|\\" +
                        "\n\t|" +"           |" +
                        "\n\t|" +"           |" +
                        "\n\t|" +"            \\" +
                        "\n\t|" +"\\");
                break;
            case 6:
                System.out.println("\n\t|" +"-----------|" +
                        "\n\t|" +"           0" +
                        "\n\t|" +"          /|\\" +"\t\t\t\tВЫ"+
                        "\n\t|" +"           |" + "\t\t\tПРОИГРАЛИ!" +
                        "\n\t|" +"           |" +
                        "\n\t|" +"          / \\" +
                        "\n\t|" +"\\");
                break;
        }
    }

    public void setNextCount(){
        this.mistakesCounter = mistakesCounter + 1;
    }

}


