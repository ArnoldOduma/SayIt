package com.techspaceke.sayit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public final String TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.exploreBtn) Button mExploreButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        final Context context = this;

        FragmentManager fm = getSupportFragmentManager();
        MoodDialogFragment moodDialogFragment = new MoodDialogFragment();
        moodDialogFragment.show(fm, "SayIt Check");

        mExploreButton.setOnClickListener(this) ;
//    {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Let's Explore SayIt", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this, GridActivity.class);
//                startActivity(intent);
//            }
//        });

//        String imageUri = "https://i.ytimg.com/vi/mSr3XU6mbjU/maxresdefault.jpg";
//        ImageView ivBasicImage = (ImageView) findViewById(R.id.homeImg);
//        Picasso.with(context).load(imageUri).into(ivBasicImage);
    }

    @Override
    public void onClick(View v) {
        if(v == mExploreButton){
//            Toast.makeText(MainActivity.this, "Let's Explore SayIt", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, GridActivity.class);
            startActivity(intent);
            Log.e(TAG, "------------------------\n--> Working");
        }else {
            Snackbar.make(v, "Leave a message", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
        }

    }
}
