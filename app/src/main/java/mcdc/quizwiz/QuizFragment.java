package mcdc.quizwiz;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class QuizFragment extends Fragment {
// Declaring QuestionBank
    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
// Declaring user interface objects
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
//Declaring variables in quiz screen
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz, container, false);

    }
// Method for updating score.
    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
// Method for updating question.
    private void updateQuestion() {
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        {

            mScoreView = getView().findViewById(R.id.score);
            mQuestionView = getView().findViewById(R.id.question);
            mButtonChoice1 = getView().findViewById(R.id.choice1);
            mButtonChoice2 = getView().findViewById(R.id.choice2);
            mButtonChoice3 = getView().findViewById(R.id.choice3);
            mButtonChoice4 = getView().findViewById(R.id.choice4);
            mScore = 0;
            mQuestionNumber = 0;
            updateQuestion();

            //Button Listeners - what happens when button is pressed.
// Button 1
            mButtonChoice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mButtonChoice1.getText() == mAnswer) {
                        mScore = mScore + 1;
                        updateScore(mScore);
                        updateQuestion();
                        Toast.makeText(getActivity(), "Correct!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getActivity(), "Wrong!", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
            });
//Button 2
            mButtonChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mButtonChoice2.getText() == mAnswer) {
                        mScore = mScore + 1;
                        updateScore(mScore);
                        updateQuestion();
                        Toast.makeText(getActivity(), "Correct!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getActivity(), "Wrong!", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
            });
// Button 3
            mButtonChoice3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mButtonChoice3.getText() == mAnswer) {
                        mScore = mScore + 1;
                        updateScore(mScore);
                        updateQuestion();
                        Toast.makeText(getActivity(), "Correct!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getActivity(), "Wrong!", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
            });
// Button 4
            mButtonChoice4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mButtonChoice4.getText() == mAnswer) {
                        mScore = mScore + 1;
                        updateScore(mScore);
                        updateQuestion();
                        Toast.makeText(getActivity(), "Correct!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getActivity(), "Wrong!", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
            });
        }

    }
}
