/*
Program Name: VideoView Example in Android

Description:
This Android activity demonstrates how to play videos using the VideoView component.
It supports both local video playback (from app resources) and online video streaming via URL.

Concepts Used:
• VideoView (Media Playback)
• URI handling (local & remote)
• Android Resources (raw folder)
• Event Handling (Button Clicks)

Features:
- Supports both offline and online video playback
- Simple UI interaction
- Uses URI for media source handling

Note:
- Local video must be placed inside res/raw folder
- Internet permission is required for online video playback

Author: Hamida Badamdi
*/


package com.hamida.myapplicationmca;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class VideoViewActivity extends AppCompatActivity {

    Button btnLocalPlay, btnUrlPlay;

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_video_view);

        videoView=findViewById(R.id.vidioview);
        btnLocalPlay=findViewById(R.id.btnLocalPlay);
        btnUrlPlay=findViewById(R.id.btnUrlPlay);


        btnLocalPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri localuri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.insp);
                videoView.setVideoURI(localuri);
                videoView.start();


            }
        });

        btnUrlPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri url = Uri.parse("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4");
                videoView.setVideoURI(url);
                videoView.start();
            }
        });



    }
}