package mcdc.quizwiz;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Weeks_Activity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    //Declare Google API Key and Resource URL for the YoutubeAPI

    static final String GOOGLE_API_KEY = "AIzaSyAsWkRZuVHwVO7HkN6SjOmzHqrLdN-2Hos";
    static final String YOUTUBE_VIDEO_ID = "9TycLR0TqFA";
    static final String YOUTUBE_VIDEO_ID2 = "sobxOzRjAGg";
    static final String YOUTUBE_VIDEO_ID3 = "GFffb2H-gK0";
    private static final String TAG = "YoutubeActivity";

    //Declare UI Elements

    Toolbar toolbar2;
    PDFView pdfView;
    YouTubePlayerView playerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weeks_);

        toolbar2 = (Toolbar) findViewById(R.id.toolbar2);
        pdfView = (PDFView) findViewById(R.id.pdf);
        playerView = (YouTubePlayerView) findViewById(R.id.player);


        //Create bundle and intents using Toolbar title to set the correct YouTube video and PDF for each topic

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            toolbar2.setTitle(bundle.getString("Topic"));
            if (toolbar2.getTitle().toString().equalsIgnoreCase("Agile Scrum")) {
                playerView.initialize(GOOGLE_API_KEY, this);

                pdfView.fromAsset("scrum.pdf")
                        .load();


            } else if (toolbar2.getTitle().toString().equalsIgnoreCase("Lean Start-up")) {
                playerView.initialize(GOOGLE_API_KEY, this);

                pdfView.fromAsset("lean.pdf")
                        .load();


            } else if (toolbar2.getTitle().toString().equalsIgnoreCase("Design Thinking")) {
                playerView.initialize(GOOGLE_API_KEY, this);

                pdfView.fromAsset("design.pdf")
                        .load();


            }


        }


    }

    // Mandatory methods for the YoutubePlayerAPI

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {

        // If statements used to change videos played based on topic by using the toolbar title of the activity

        if (toolbar2.getTitle().toString().equalsIgnoreCase("Agile Scrum")) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID);

        } else if (toolbar2.getTitle().toString().equalsIgnoreCase("Lean Start-up")) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID2);

        } else youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID3);
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult
            youTubeInitializationResult) {
        final int REQUEST_CODE = 1;

        if (youTubeInitializationResult.isUserRecoverableError()) {
            youTubeInitializationResult.getErrorDialog(this, REQUEST_CODE).show();
        }

        }
    }



