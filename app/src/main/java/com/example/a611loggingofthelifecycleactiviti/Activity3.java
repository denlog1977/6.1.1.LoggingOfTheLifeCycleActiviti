package com.example.a611loggingofthelifecycleactiviti;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);


        Button button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {

//                                          Intent contacts = new Uri("content://contacts") {
//                                              @Nullable
//                                              @Override
//                                              public String getUserInfo() {
//                                                  return null;
//                                              }
//                                          };
//                                          Intent intent = new Intent(Activity2.this, contacts);
//                                          startActivityForResult(intent, 2);
////                                                  new Intent(Intent.ACTION_PICK, contacts),
////                                                  Intent.ACTION_PICK_ACTIVITYPICK_CONTACT_REQUEST);
////                                          startActivity(intent);
                                      }
                                  }
        );



    }
}
