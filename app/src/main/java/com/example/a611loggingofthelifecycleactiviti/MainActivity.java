package com.example.a611loggingofthelifecycleactiviti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Toast.makeText(this, "onCreate!", Toast.LENGTH_SHORT).show();
        Log.e("DEN", "Сработало событие onCreate");

//        TextView textView = findViewById(R.id.tv);
//        onKeyLongPress( {
//
//            Toast.makeText(this, "onKeyLongPress!", Toast.LENGTH_SHORT);
//
//        });

//        super.onKeyLongPress(R.id.button, getSearchEvent());


        Button button = findViewById(R.id.button);
//        button.setOnClickListener();
//
//        super.() ;

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart!", Toast.LENGTH_SHORT).show();
        Log.e("DEN", "Сработало событие onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume!", Toast.LENGTH_SHORT).show();
        Log.e("DEN", "Сработало событие onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause!", Toast.LENGTH_SHORT).show();
        Log.e("DEN", "Сработало событие onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop!", Toast.LENGTH_SHORT).show();
        Log.e("DEN", "Сработало событие onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy!", Toast.LENGTH_SHORT).show();
        Log.e("DEN", "Сработало событие onDestroy");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(this, "onBackPressed!", Toast.LENGTH_SHORT).show();
        Log.e("DEN", "Сработало событие onBackPressed(");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart!", Toast.LENGTH_SHORT);
    }

}



