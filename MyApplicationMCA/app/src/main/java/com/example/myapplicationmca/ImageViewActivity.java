/*
Program Name: ImageView Toggle Activity

Description:
This Android program demonstrates how to dynamically change
images in an ImageView using a button click.

Features:
- Displays an image using ImageView
- Button click toggles between two images
- Toast messages provide user feedback
- Uses boolean flag to track current image state

Author: Hamida Badamdi
*/

package com.hamida.myapplicationmca;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ImageViewActivity extends AppCompatActivity {

    ImageView imgview;
    Button btnChange;
    boolean isFirstImg = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        imgview = findViewById(R.id.imgview);
        btnChange = findViewById(R.id.btnChange);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(isFirstImg)
                {
                    imgview.setImageResource(R.drawable.profile2);
                    Toast.makeText(ImageViewActivity.this, "Image Changed", Toast.LENGTH_SHORT).show();
                    isFirstImg = false;

                }
                else
                {
                    imgview.setImageResource(R.drawable.mulogo);
                    Toast.makeText(ImageViewActivity.this, "Image Changed Back", Toast.LENGTH_SHORT).show();
                    isFirstImg=true;
                }

            }

        });


    }
}