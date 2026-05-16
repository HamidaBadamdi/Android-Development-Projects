package com.hamida.myapplicationmca;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        //Check if the location is granted...

        if (!isLocationPermissionGranted())
        {
            requestLocationPermission();
        }

        startLocationFatch();

    }


    private boolean isLocationPermissionGranted()
    {
        return ContextCompat.checkSelfPermission(this,
                Constants.LOCATION_PERMISSION) == PackageManager.PERMISSION_GRANTED;
    }


    private void requestLocationPermission()
    {

        ActivityCompat.requestPermissions(this , new String[] {Constants.LOCATION_PERMISSION},
                    Constants.map);
    }

    private  void startLocationFatch()
    {

    }
}