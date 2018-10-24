package mcdc.quizwiz;

public class QuestionLibrary {

    private String mQuestions[] = {
            "Question1",
            "Question2",
            "Question3",
            "Question4"


    };

    private String mChoices [][] = {
            {"Answer1", "Answer2", "Answer3", "Answer4"},
            {"Poop1","Poop2","Poop3","Poop4"},
            {"Test1","Test2","Test3","Test4"},
            {"Correct1","Correct2","Correct3","Correct"}

    };

    private String mCorrectAnswers[] = {"Answer2", "Poop3", "Test4", "Correct1"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }
//  Choices are in an array - array starts at 0 therefore choice 1 is array index 0.
    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

//

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
