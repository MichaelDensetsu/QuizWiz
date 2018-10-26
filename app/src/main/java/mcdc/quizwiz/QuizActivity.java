package mcdc.quizwiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class QuizActivity  extends AppCompatActivity {

    // Declaring QuestionBank
    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    // Declaring user interface objects
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    Toolbar toolbar;
    // Declaring variables in quiz screen
    private String mAnswer;
    public int mScore = 0;
    private int mQuestionNumber = 0;
    private int mQuestionsAnswered = 0;
    // Declaring database
    DatabaseHelper mDatabaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
// Quiz items
        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mScore = 0;
// Toolbar name
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("Quiz - INFS2603");
// Database
        mDatabaseHelper = new DatabaseHelper(this);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            toolbar.setTitle(bundle.getString("Week"));
            if (toolbar.getTitle().toString().equalsIgnoreCase("Week 1 - Agile Scrum")) {
                mQuestionNumber = 0;
            }
            if (toolbar.getTitle().toString().equalsIgnoreCase("Week 2 - Lean Start-up")) {
                mQuestionNumber = 5;
            }
            if (toolbar.getTitle().toString().equalsIgnoreCase("Week 3 - Design Thinking")) {
                mQuestionNumber = 10;
            }
            updateQuestion();
        }

        //Button Listeners - what happens when button is pressed.
// Button 1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mQuestionsAnswered++;
                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
//Button 2
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mQuestionsAnswered++;
                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
// Button 3
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mQuestionsAnswered++;
                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
// Button 4
        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mQuestionsAnswered++;
                if (mButtonChoice4.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
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
        if ( mQuestionsAnswered == 5) {
            finish();
            String score = String.valueOf(mScore);
            mDatabaseHelper.addData(score);
            Intent results = new Intent(getApplicationContext(),ResultsActivity.class);
            results.putExtra("Scores", score);
            startActivity(results);
        }
        else {
            mQuestionNumber++;
        }
    }

}