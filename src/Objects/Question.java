package Objects;

import java.util.ArrayList;

public class Question {
    public String question;
    public ArrayList<String> listOfAnswers;
    public int indexOfRightAnswer;

    public Integer ID;

    public Question(String q, ArrayList<String> listOfA, int indexOfRight, int hashcode) {
        question = q;
        listOfAnswers = listOfA;
        indexOfRightAnswer = indexOfRight;
        this.ID = hashcode;
    }
}
