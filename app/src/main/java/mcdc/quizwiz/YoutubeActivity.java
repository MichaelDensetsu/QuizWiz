package mcdc.quizwiz;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class YoutubeActivity extends YouTubeBaseActivity {

    static final String GOOGLE_API_KEY = "AIzaSyAsWkRZuVHwVO7HkN6SjOmzHqrLdN-2Hos";

    static final String YOUTUBE_PLAYLIST1 = "PLXtTjtWmQhg1SsviTmKkWO5n0a_-T0bnD";
    static final String YOUTUBE_PLAYLIST2 = "PLXtTjtWmQhg1SsviTmKkWO5n0a_-T0bnD";
    static final String YOUTUBE_PLAYLIST3 = "PLXtTjtWmQhg1SsviTmKkWO5n0a_-T0bnD";
    static final String YOUTUBE_PLAYLIST4 = "PLXtTjtWmQhg1SsviTmKkWO5n0a_-T0bnD";
    static final String YOUTUBE_PLAYLIST5 = "PLXtTjtWmQhg1SsviTmKkWO5n0a_-T0bnD";
    static final String YOUTUBE_PLAYLIST6 = "PLXtTjtWmQhg1SsviTmKkWO5n0a_-T0bnD";
    static final String YOUTUBE_PLAYLIST7 = "PLXtTjtWmQhg1SsviTmKkWO5n0a_-T0bnD";
    static final String YOUTUBE_PLAYLIST8 = "PLXtTjtWmQhg1SsviTmKkWO5n0a_-T0bnD";
    static final String YOUTUBE_PLAYLIST9 = "PLXtTjtWmQhg1SsviTmKkWO5n0a_-T0bnD";
    static final String YOUTUBE_PLAYLIST10 = "PLXtTjtWmQhg1SsviTmKkWO5n0a_-T0bnD";


    private static final String TAG = "YoutubeActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_youtube);
        // ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.activity_youtube);

        ConstraintLayout layout = (ConstraintLayout) getLayoutInflater().inflate(R.layout.activity_youtube, null);
        setContentView(layout);


        YouTubePlayerView playerView = new YouTubePlayerView(this);
        playerView.setLayoutParams(new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        layout.addView(playerView);


    }


}

