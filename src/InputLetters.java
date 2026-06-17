public class InputLetters {
    StringBuffer inputLetter = new StringBuffer();


    void addInputLetter(char a){
        inputLetter.append(a);
    }

    boolean isLetterNew(char a){
        for(int i =0; i < inputLetter.length(); i++){
            if (inputLetter.charAt(i) == a) {
                return false;
            }
        }
    
        return true;
    }
   



}
