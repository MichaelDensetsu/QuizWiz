package mcdc.quizwiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class Weeks_Activity extends AppCompatActivity {

    Toolbar toolbar2;
    Button button;

    Button buttonQuiz;
    Button buttonNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weeks_);

        toolbar2 = (Toolbar) findViewById(R.id.toolbar2);
        button = (Button) findViewById(R.id.buttonVideo);

        buttonQuiz = (Button) findViewById(R.id.buttonQuiz);
        buttonNext = (Button) findViewById(R.id.buttonNext);

        //  buttonQuiz.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //  public void onClick(View view) {
        //    Intent intent = new Intent(Weeks_Activity.this, QuizFragment.class);
        //  startActivity(intent);
    // }
    //});
    // buttonNext.setOnClickListener(new View.OnClickListener() {
    //   @Override
    // public void onClick(View view) {
    //   Intent intent = new Intent(Weeks_Activity.this, Weeks_Activity.class);
    // startActivity(intent);
    // }
    //});

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            toolbar2.setTitle(bundle.getString("Week"));
            if (toolbar2.getTitle().toString().equalsIgnoreCase("Week 1")) {
                // button.setVisibility(button.VISIBLE);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = null;
                        switch (view.getId()) {
                            case R.id.buttonVideo:
                                intent = YouTubeStandalonePlayer.createPlaylistIntent(Weeks_Activity.this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST1);
                                break;
                        }
                        if (intent != null) {
                            startActivity(intent);
                        }
                    }
                });


            }
            else if (toolbar2.getTitle().toString().equalsIgnoreCase("Week 2")) {
                // button.setVisibility(button.VISIBLE);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = null;
                        switch (view.getId()) {
                            case R.id.buttonVideo:
                                intent = YouTubeStandalonePlayer.createPlaylistIntent(Weeks_Activity.this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST2);
                                break;
                        }
                        if (intent != null) {
                            startActivity(intent);
                        }
                    }
                });


            }

        }


    }
}


