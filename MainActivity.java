package com.example.audioplayer_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initiate a video view
        Uri uri = Uri.parse("https://smartresult.000webhostapp.com/Fireworks__1346.mp4");
        VideoView simpleVideoView = (VideoView) findViewById(R.id.simpleVideoView); // initiate a video view
        simpleVideoView.setVideoURI(uri);
        simpleVideoView.start();
    }
}
