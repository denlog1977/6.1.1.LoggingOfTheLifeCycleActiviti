package com.example.a611loggingofthelifecycleactiviti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent = new Intent(Activity2.this, Activity3.class);
                                          startActivity(intent);
                                      }
                                  }
        );



    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.i("Lifecycle_DEN",  "onKeyDown keyCode=" + Integer.toString(keyCode) + "\n KeyEvent=" + event.toString());
        String textMessage = "";
        if(event.getDeviceId() == 7) {
            textMessage = "KEYCODE_VOLUME_UP - Увеличение громкости";
        } else if (event.getDeviceId() == 5) {
            textMessage = "KEYCODE_VOLUME_DOWN - Уменьшение громкости";
        } else if (event.getDeviceId() == 8) {
        textMessage = "KEYCODE_BACK - Кнопка назад";
        }
        Toast.makeText(this, textMessage, Toast.LENGTH_SHORT).show();
        return super.onKeyDown(keyCode, event);
        //return true;
        //return false;

    }

}
