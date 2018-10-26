package mcdc.quizwiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResultsActivity extends AppCompatActivity {

    private TextView mScoreView;
    private Button mButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        mScoreView = (TextView)findViewById(R.id.score);
        mButton = (Button)findViewById(R.id.button);

        Bundle extras = getIntent().getExtras();
        String mScore = extras.getString("Scores");
        mScoreView.setText("" + mScore);

        // Button 1
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


}

