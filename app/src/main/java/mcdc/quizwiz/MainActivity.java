package mcdc.quizwiz;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // Declaring user interface objects.
    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;
    // Declaring fragments.
    private QuizFragment quizFragment;
    private ResourcesFragment resourcesFragment;
    private AboutFragment aboutFragment;


    Button button;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Initialisation
        mMainFrame = (FrameLayout) findViewById(R.id.main_frame);
        mMainNav = (BottomNavigationView) findViewById(R.id.main_nav);
        mMainNav.setVisibility(View.INVISIBLE);

        quizFragment = new QuizFragment();
        resourcesFragment = new ResourcesFragment();
        aboutFragment = new AboutFragment();
//

        final Button button = (Button) findViewById(R.id.button);
        final TextView textView = (TextView) findViewById(R.id.textView2);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        imageView = (ImageView) findViewById(R.id.imageView2);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

                fragmentTransaction.replace(R.id.main_frame, quizFragment);
                fragmentTransaction.commit();

                button.setVisibility(View.INVISIBLE);
                mMainNav.setVisibility(View.VISIBLE);
                textView.setVisibility(View.INVISIBLE);
                toolbar.setVisibility(View.INVISIBLE);
                imageView.setVisibility(View.INVISIBLE);


            }
        });

// Controllers for bottom navigation bar - changing fragments/screens
        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {

                    case R.id.nav_quiz:
                        mMainNav.setItemBackgroundResource(R.color.colorPrimary);
                        setFragment(quizFragment);
                        return true;

                    case R.id.nav_resources:
                        mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
                        setFragment(resourcesFragment);
                        return true;

                    case R.id.nav_about:
                        mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
                        setFragment(aboutFragment);
                        return true;
                    default:
                        return false;
                }
//
            }
            // Method for setting up which fragment to change to.
            private void setFragment(Fragment fragment) {

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

                fragmentTransaction.replace(R.id.main_frame, fragment);
                fragmentTransaction.commit();

            }


        });
    }



    }

