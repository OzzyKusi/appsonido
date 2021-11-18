package com.example.appsonido;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button audio;
    private Object Package;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audio = (Button) findViewById(R.id.audio);
        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarAudio();
            }
        });
    }
    private void LlamarAudio(){
        Intent intent=new Intent
                ( MainActivity.this,botones.class);
                startActivity(intent);
            }
    }

