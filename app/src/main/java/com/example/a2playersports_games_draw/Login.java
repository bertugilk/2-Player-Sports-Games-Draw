package com.example.a2playersports_games_draw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText plyr1Name,plyr2Name;
    Button btnStart;
    Context context=this;
    Bundle bundle;
    Intent intent;
    Spinner macSayisi;
    MediaPlayer music;
    int sayi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        music=MediaPlayer.create(context,R.raw.music);
        music.start();
        init();

        macSayisi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                sayi= (int) adapterView.getItemIdAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(context,Team_Add_Remove.class);
                bundle=new Bundle();
                bundle.putString("plyr1Name",plyr1Name.getText().toString());
                bundle.putString("plyr2Name",plyr2Name.getText().toString());
                bundle.putString("macSayisi", String.valueOf(sayi));
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
    public void init(){
        plyr1Name=findViewById(R.id.plyr1Name);
        plyr2Name=findViewById(R.id.plyr2Name);
        btnStart=findViewById(R.id.btnStart);
        macSayisi=findViewById(R.id.macSayisi);
    }
}