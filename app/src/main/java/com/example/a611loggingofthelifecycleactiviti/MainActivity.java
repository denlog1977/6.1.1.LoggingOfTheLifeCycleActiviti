package com.example.a611loggingofthelifecycleactiviti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView textView = findViewById(R.id.tv);
//        onKeyLongPress( {
//
//            Toast.makeText(this, "onKeyLongPress!", Toast.LENGTH_SHORT);
//
//        });

//        super.onKeyLongPress(R.id.button, getSearchEvent());

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new );

        super.onBackPressed() ;


    }

}



