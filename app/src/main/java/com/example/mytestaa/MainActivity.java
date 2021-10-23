package com.example.mytestaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private View.OnClickListener onMainClickListener =new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(view.getId()){
                case R.id.button1:
                    Intent intent = new Intent(MainActivity.this,Splash.class);
                    startActivity(intent);

                case R.id.button2:

                case R.id.button3:

                case R.id.button4:
                    break;

            }
        }
    };
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= findViewById(R.id.button1);
        button1.setOnClickListener(onMainClickListener);


    }
}