package com.example.mytestaa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;

public class Splash extends Activity {
    private Button mEnterButton;
    private View.OnClickListener buttonClickListener =new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.EnterButton:
                    Intent intent = new Intent(Splash.this,MainActivity.class);
                    startActivity(intent);
                    break;
            }

        }
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mEnterButton = findViewById(R.id.EnterButton);
        mEnterButton.setOnClickListener(buttonClickListener);

    }
}
