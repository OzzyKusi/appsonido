package com.example.appsonido;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class botones extends AppCompatActivity {
    ImageButton btnmusealbumbhr;
    ImageButton btnrhalbumkida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);

        btnmusealbumbhr = findViewById(R.id.musealbumbhr);
        btnrhalbumkida = findViewById(R.id.rhalbumkida);

        btnrhalbumkida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(botones.this, R.raw.rhifyousay);
                mp.start();
            }
        });
        btnmusealbumbhr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(botones.this, R.raw.mussbh);
                mp.start();
            }
        });
    }
        public void MENSAJEMUSE (View view){
            Toast.makeText(this,"El tema más conocido de este albúm de la banda MUSE", Toast.LENGTH_LONG).show();
            }
        public void MENSAJERH (View view){
            Toast.makeText(this,"El tema más conocido de este albúm de la banda RADIOHEADç", Toast.LENGTH_LONG).show();
    }



}