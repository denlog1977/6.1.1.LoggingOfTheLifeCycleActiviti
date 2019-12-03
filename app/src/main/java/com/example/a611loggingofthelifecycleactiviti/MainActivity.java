package com.example.a611loggingofthelifecycleactiviti;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();//String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        textViewAppend(Thread.currentThread().getStackTrace()[2].getMethodName());
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        TextView textView = findViewById(R.id.tv);
        textView.append("\n" + methodName);
        textView.append("\nРавен ли входной параметр Bundle null: " + (savedInstanceState == null));
        Toast.makeText(this, methodName, Toast.LENGTH_SHORT).show();
        Log.i("Lifecycle_DEN", "Сработало событие " + methodName);



//        onKeyLongPress( {
//            Toast.makeText(this, "onKeyLongPress!", Toast.LENGTH_SHORT);
//        });

        //super.onKeyLongPress(R.id.button, getSearchEvent());


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textViewAppend(Thread.currentThread().getStackTrace()[2].getMethodName());
    }
    @Override
    protected void onStart() {
        super.onStart();
        textViewAppend(Thread.currentThread().getStackTrace()[2].getMethodName());

    }
    @Override
    protected void onResume() {
        super.onResume();
        textViewAppend(Thread.currentThread().getStackTrace()[2].getMethodName());
    }
    @Override
    protected void onPause() {
        super.onPause();
        textViewAppend(Thread.currentThread().getStackTrace()[2].getMethodName());
    }
    @Override
    protected void onStop() {
        super.onStop();
        textViewAppend(Thread.currentThread().getStackTrace()[2].getMethodName());
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        TextView textView = findViewById(R.id.tv);
        textView.append("\n" + methodName);
        Toast.makeText(this, methodName, Toast.LENGTH_SHORT).show();
        Log.i("Lifecycle_DEN", "Сработало событие " + methodName);
        outState.putString("tv", textView.getText().toString());
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        textViewAppend(Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        textViewAppend(Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        textViewAppend(Thread.currentThread().getStackTrace()[2].getMethodName());
        Log.i("Lifecycle_DEN",  "onKeyDown keyCode=" + Integer.toString(keyCode) + "\n KeyEvent=" + event.toString());
        String textMessage = "";
        if(event.getDeviceId() == 7) {
            textMessage = "KEYCODE_VOLUME_UP - Увеличение громкости";
        } else if (event.getDeviceId() == 5) {
            textMessage = "KEYCODE_VOLUME_DOWN - Уменьшение громкости";
        }
        Toast.makeText(this, textMessage, Toast.LENGTH_SHORT).show();
        TextView textView = findViewById(R.id.tv);
        textView.append("\n" + textMessage);
        return super.onKeyDown(keyCode, event);
        //return true;
        //return false;

    }




//    @Override
//    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
//        super.onSaveInstanceState(outState, outPersistentState);
//        textViewAppend(Thread.currentThread().getStackTrace()[2].getMethodName());
//    }


//    @Override
//    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
//        super.onRestoreInstanceState(savedInstanceState, persistentState);
//        textViewAppend(Thread.currentThread().getStackTrace()[2].getMethodName());
//    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        TextView textView = findViewById(R.id.tv);
        textView.setText(savedInstanceState.getString("tv"));
        textViewAppend(Thread.currentThread().getStackTrace()[2].getMethodName());
    }



    public void textViewAppend(String methodName) {
        TextView textView = findViewById(R.id.tv);
        textView.append("\n" + methodName);
        Toast.makeText(this, methodName, Toast.LENGTH_SHORT).show();
        Log.i("Lifecycle_DEN", "Сработало событие " + methodName);
    }
}



