package com.hamida.myapplicationmca;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SensorActivity extends AppCompatActivity implements SensorEventListener {

    //Sensor objects
    private SensorManager sensorManager;
    private  Sensor sensor;

    //Sensor control
    private CameraManager cameraManager;
    private  String cameraID;

    private  boolean isFlashOn = false;

    // Shake detection config
    private  static  final  float ALPHA = 0.8f;
    private  static  final  float SHAKE_THRESHOLD = 12f;
    private  static  final  long SHAKE_DELAY = 1000; // 1 SEC GAP

    private final  float[] gravity =  new float[3];
    private final  float[] liner =  new float[3];


    private TextView txtStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sensor);
        initViews();
        setupSensor();
        setupFlash();

    }

    private  void initViews()
    {
        txtStatus = findViewById(R.id.txtStatus);
    }
    @Override
    protected void onResume() {
        super.onResume();

        if(sensorManager != null && sensor != null)
        {
            sensorManager.registerListener(this , sensor , SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    protected void onPause() {

        if(sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        super.onPause();
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        gravity[0] = ALPHA * gravity[0] + (1- ALPHA) * sensorEvent .values[0];
        gravity[1] = ALPHA * gravity[1] + (1- ALPHA) * sensorEvent .values[1];
        gravity[2] = ALPHA * gravity[2] + (1- ALPHA) * sensorEvent .values[2];

        liner[0] = sensorEvent.values[0] - gravity[0];
        liner[1] = sensorEvent.values[1] - gravity[1];
        liner[2] = sensorEvent.values[2] - gravity[2];


    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    private  void setupSensor()
    {
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        if (sensorManager != null)
        {
            sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        }
    }

    private  void  setupFlash()
    {
        cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
        try {

                if(cameraManager != null)
                {
                    cameraID = cameraManager.getCameraIdList()[0];
                }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private  void toggleFlash()
    {
        try {

            if (cameraManager == null | cameraID == null)
                return;

            isFlashOn = !isFlashOn;
            cameraManager.setTorchMode(cameraID ,isFlashOn );
            txtStatus.setText(isFlashOn ? "Flash ON" : "Flsh OFF");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}