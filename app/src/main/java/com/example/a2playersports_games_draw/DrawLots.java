package com.example.a2playersports_games_draw;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class DrawLots extends AppCompatActivity {
    Context context=this;
    TextView player1Name,player2Name,ply1Team1,ply2Team1,ply1Team2,ply2Team2,ply1Team3,ply2Team3,ply1Team4,ply2Team4,ply1Team5,ply2Team5,ply1Team6,ply2Team6,
            ply1Team7,ply2Team7,ply1Team8,ply2Team8,ply1Team9,ply2Team9,ply1Team10,ply2Team10;
    Button btnMac1,btnMac2,btnMac3,btnMac4,btnMac5,btnMac6,btnMac7,btnMac8,btnMac9,btnMac10;
    int sayi=0;
    String randomElement=null;
    ArrayList<String> teamNames=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.draw_lots_screen);
        init();
        Bundle data=getIntent().getExtras();


        teamNames=data.getStringArrayList("teams");


        String name1=data.getString("name1");
        String name2=data.getString("name2");
        String macSayisi=data.getString("macSayisi");
        settingVisibility(macSayisi);
        player1Name.setText(name1);
        player2Name.setText(name2);

        btnMac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tkm1();
                tkm2();
                btnMac1.setClickable(false);
                btnMac1.setBackgroundColor(Color.DKGRAY);
            }
        });
        btnMac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tkm3();
                tkm4();
                btnMac2.setClickable(false);
                btnMac2.setBackgroundColor(Color.DKGRAY);

            }
        });
        btnMac3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tkm5();
                tkm6();
                btnMac3.setClickable(false);
                btnMac3.setBackgroundColor(Color.DKGRAY);

            }
        });
        btnMac4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tkm7();
                tkm8();
                btnMac4.setClickable(false);
                btnMac4.setBackgroundColor(Color.DKGRAY);

            }
        });
        btnMac5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tkm9();
                tkm10();
                btnMac5.setClickable(false);
                btnMac5.setBackgroundColor(Color.DKGRAY);

            }
        });
        btnMac6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tkm11();
                tkm12();
                btnMac6.setClickable(false);
                btnMac6.setBackgroundColor(Color.DKGRAY);

            }
        });
        btnMac7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tkm13();
                tkm14();
                btnMac7.setClickable(false);
                btnMac7.setBackgroundColor(Color.DKGRAY);

            }
        });
        btnMac8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tkm15();
                tkm16();
                btnMac8.setClickable(false);
                btnMac8.setBackgroundColor(Color.DKGRAY);
            }
        });
        btnMac9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tkm17();
                tkm18();
                btnMac9.setClickable(false);
                btnMac9.setBackgroundColor(Color.DKGRAY);

            }
        });
        btnMac10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tkm19();
                tkm20();
                btnMac10.setClickable(false);
                btnMac10.setBackgroundColor(Color.DKGRAY);

            }
        });
    }
    public void tkm1(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply1Team1.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm2(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply2Team1.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm3(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply1Team2.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm4(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply2Team2.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm5(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply1Team3.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm6(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply2Team3.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm7(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply1Team4.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm8(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply2Team4.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm9(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply1Team5.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm10(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply2Team5.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm11(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply1Team6.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm12(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply2Team6.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm13(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply1Team7.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm14(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply2Team7.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm15(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply1Team8.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm16(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply2Team8.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm17(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply1Team9.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm18(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply2Team9.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm19(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply1Team10.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }
    public void tkm20(){
        for(int i=0;i<teamNames.size();i++){
            Random random=new Random();
            sayi=random.nextInt(teamNames.size());
            randomElement = teamNames.get(sayi);

        }
        ply2Team10.setText(String.valueOf(randomElement));
        teamNames.remove(teamNames.get(sayi));
    }

    public void init(){
        player1Name=findViewById(R.id.player1Name);
        player2Name=findViewById(R.id.player2Name);
        ply1Team1=findViewById(R.id.ply1Team1);
        ply2Team1=findViewById(R.id.ply2Team1);
        ply1Team2=findViewById(R.id.ply1Team2);
        ply2Team2=findViewById(R.id.ply2Team2);
        ply1Team3=findViewById(R.id.ply1Team3);
        ply2Team3=findViewById(R.id.ply2Team3);
        ply1Team4=findViewById(R.id.ply1Team4);
        ply2Team4=findViewById(R.id.ply2Team4);
        ply1Team5=findViewById(R.id.ply1Team5);
        ply2Team5=findViewById(R.id.ply2Team5);
        ply1Team6=findViewById(R.id.ply1Team6);
        ply2Team6=findViewById(R.id.ply2Team6);
        ply1Team7=findViewById(R.id.ply1Team7);
        ply2Team7=findViewById(R.id.ply2Team7);
        ply1Team8=findViewById(R.id.ply1Team8);
        ply2Team8=findViewById(R.id.ply2Team8);
        ply1Team9=findViewById(R.id.ply1Team9);
        ply2Team9=findViewById(R.id.ply2Team9);
        ply1Team10=findViewById(R.id.ply1Team10);
        ply2Team10=findViewById(R.id.ply2Team10);
        btnMac1=findViewById(R.id.btnMac1);
        btnMac2=findViewById(R.id.btnMac2);
        btnMac3=findViewById(R.id.btnMac3);
        btnMac4=findViewById(R.id.btnMac4);
        btnMac5=findViewById(R.id.btnMac5);
        btnMac6=findViewById(R.id.btnMac6);
        btnMac7=findViewById(R.id.btnMac7);
        btnMac8=findViewById(R.id.btnMac8);
        btnMac9=findViewById(R.id.btnMac9);
        btnMac10=findViewById(R.id.btnMac10);
    }

    public void settingVisibility(String matchNumber){
        switch (matchNumber){
            case "0":
                ply1Team1.setVisibility(View.VISIBLE);
                ply2Team1.setVisibility(View.VISIBLE);
                btnMac1.setVisibility(View.VISIBLE);
                break;
            case "1":
                ply1Team1.setVisibility(View.VISIBLE);
                ply2Team1.setVisibility(View.VISIBLE);
                ply1Team2.setVisibility(View.VISIBLE);
                ply2Team2.setVisibility(View.VISIBLE);
                btnMac1.setVisibility(View.VISIBLE);
                btnMac2.setVisibility(View.VISIBLE);
                break;
            case "2":
                ply1Team1.setVisibility(View.VISIBLE);
                ply2Team1.setVisibility(View.VISIBLE);
                ply1Team2.setVisibility(View.VISIBLE);
                ply2Team2.setVisibility(View.VISIBLE);
                ply1Team3.setVisibility(View.VISIBLE);
                ply2Team3.setVisibility(View.VISIBLE);
                btnMac1.setVisibility(View.VISIBLE);
                btnMac2.setVisibility(View.VISIBLE);
                btnMac3.setVisibility(View.VISIBLE);
                break;
            case "3":
                ply1Team1.setVisibility(View.VISIBLE);
                ply2Team1.setVisibility(View.VISIBLE);
                ply1Team2.setVisibility(View.VISIBLE);
                ply2Team2.setVisibility(View.VISIBLE);
                ply1Team3.setVisibility(View.VISIBLE);
                ply2Team3.setVisibility(View.VISIBLE);
                ply1Team4.setVisibility(View.VISIBLE);
                ply2Team4.setVisibility(View.VISIBLE);
                btnMac1.setVisibility(View.VISIBLE);
                btnMac2.setVisibility(View.VISIBLE);
                btnMac3.setVisibility(View.VISIBLE);
                btnMac4.setVisibility(View.VISIBLE);
                break;
            case "4":
                ply1Team1.setVisibility(View.VISIBLE);
                ply2Team1.setVisibility(View.VISIBLE);
                ply1Team2.setVisibility(View.VISIBLE);
                ply2Team2.setVisibility(View.VISIBLE);
                ply1Team3.setVisibility(View.VISIBLE);
                ply2Team3.setVisibility(View.VISIBLE);
                ply1Team4.setVisibility(View.VISIBLE);
                ply2Team4.setVisibility(View.VISIBLE);
                ply1Team5.setVisibility(View.VISIBLE);
                ply2Team5.setVisibility(View.VISIBLE);
                btnMac1.setVisibility(View.VISIBLE);
                btnMac2.setVisibility(View.VISIBLE);
                btnMac3.setVisibility(View.VISIBLE);
                btnMac4.setVisibility(View.VISIBLE);
                btnMac5.setVisibility(View.VISIBLE);
                break;
            case "5":
                ply1Team1.setVisibility(View.VISIBLE);
                ply2Team1.setVisibility(View.VISIBLE);
                ply1Team2.setVisibility(View.VISIBLE);
                ply2Team2.setVisibility(View.VISIBLE);
                ply1Team3.setVisibility(View.VISIBLE);
                ply2Team3.setVisibility(View.VISIBLE);
                ply1Team4.setVisibility(View.VISIBLE);
                ply2Team4.setVisibility(View.VISIBLE);
                ply1Team5.setVisibility(View.VISIBLE);
                ply2Team5.setVisibility(View.VISIBLE);
                ply1Team6.setVisibility(View.VISIBLE);
                ply2Team6.setVisibility(View.VISIBLE);
                btnMac1.setVisibility(View.VISIBLE);
                btnMac2.setVisibility(View.VISIBLE);
                btnMac3.setVisibility(View.VISIBLE);
                btnMac4.setVisibility(View.VISIBLE);
                btnMac5.setVisibility(View.VISIBLE);
                btnMac6.setVisibility(View.VISIBLE);
                break;
            case "6":
                ply1Team1.setVisibility(View.VISIBLE);
                ply2Team1.setVisibility(View.VISIBLE);
                ply1Team2.setVisibility(View.VISIBLE);
                ply2Team2.setVisibility(View.VISIBLE);
                ply1Team3.setVisibility(View.VISIBLE);
                ply2Team3.setVisibility(View.VISIBLE);
                ply1Team4.setVisibility(View.VISIBLE);
                ply2Team4.setVisibility(View.VISIBLE);
                ply1Team5.setVisibility(View.VISIBLE);
                ply2Team5.setVisibility(View.VISIBLE);
                ply1Team6.setVisibility(View.VISIBLE);
                ply2Team6.setVisibility(View.VISIBLE);
                ply1Team7.setVisibility(View.VISIBLE);
                ply2Team7.setVisibility(View.VISIBLE);
                btnMac1.setVisibility(View.VISIBLE);
                btnMac2.setVisibility(View.VISIBLE);
                btnMac3.setVisibility(View.VISIBLE);
                btnMac4.setVisibility(View.VISIBLE);
                btnMac5.setVisibility(View.VISIBLE);
                btnMac6.setVisibility(View.VISIBLE);
                btnMac7.setVisibility(View.VISIBLE);
                break;
            case "7":
                ply1Team1.setVisibility(View.VISIBLE);
                ply2Team1.setVisibility(View.VISIBLE);
                ply1Team2.setVisibility(View.VISIBLE);
                ply2Team2.setVisibility(View.VISIBLE);
                ply1Team3.setVisibility(View.VISIBLE);
                ply2Team3.setVisibility(View.VISIBLE);
                ply1Team4.setVisibility(View.VISIBLE);
                ply2Team4.setVisibility(View.VISIBLE);
                ply1Team5.setVisibility(View.VISIBLE);
                ply2Team5.setVisibility(View.VISIBLE);
                ply1Team6.setVisibility(View.VISIBLE);
                ply2Team6.setVisibility(View.VISIBLE);
                ply1Team7.setVisibility(View.VISIBLE);
                ply2Team7.setVisibility(View.VISIBLE);
                ply1Team8.setVisibility(View.VISIBLE);
                ply2Team8.setVisibility(View.VISIBLE);
                btnMac1.setVisibility(View.VISIBLE);
                btnMac2.setVisibility(View.VISIBLE);
                btnMac3.setVisibility(View.VISIBLE);
                btnMac4.setVisibility(View.VISIBLE);
                btnMac5.setVisibility(View.VISIBLE);
                btnMac6.setVisibility(View.VISIBLE);
                btnMac7.setVisibility(View.VISIBLE);
                btnMac8.setVisibility(View.VISIBLE);
                break;
            case "8":
                ply1Team1.setVisibility(View.VISIBLE);
                ply2Team1.setVisibility(View.VISIBLE);
                ply1Team2.setVisibility(View.VISIBLE);
                ply2Team2.setVisibility(View.VISIBLE);
                ply1Team3.setVisibility(View.VISIBLE);
                ply2Team3.setVisibility(View.VISIBLE);
                ply1Team4.setVisibility(View.VISIBLE);
                ply2Team4.setVisibility(View.VISIBLE);
                ply1Team5.setVisibility(View.VISIBLE);
                ply2Team5.setVisibility(View.VISIBLE);
                ply1Team6.setVisibility(View.VISIBLE);
                ply2Team6.setVisibility(View.VISIBLE);
                ply1Team7.setVisibility(View.VISIBLE);
                ply2Team7.setVisibility(View.VISIBLE);
                ply1Team8.setVisibility(View.VISIBLE);
                ply2Team8.setVisibility(View.VISIBLE);
                ply1Team9.setVisibility(View.VISIBLE);
                ply2Team9.setVisibility(View.VISIBLE);
                btnMac1.setVisibility(View.VISIBLE);
                btnMac2.setVisibility(View.VISIBLE);
                btnMac3.setVisibility(View.VISIBLE);
                btnMac4.setVisibility(View.VISIBLE);
                btnMac5.setVisibility(View.VISIBLE);
                btnMac6.setVisibility(View.VISIBLE);
                btnMac7.setVisibility(View.VISIBLE);
                btnMac8.setVisibility(View.VISIBLE);
                btnMac9.setVisibility(View.VISIBLE);
                break;
            case "9":
                ply1Team1.setVisibility(View.VISIBLE);
                ply2Team1.setVisibility(View.VISIBLE);
                ply1Team2.setVisibility(View.VISIBLE);
                ply2Team2.setVisibility(View.VISIBLE);
                ply1Team3.setVisibility(View.VISIBLE);
                ply2Team3.setVisibility(View.VISIBLE);
                ply1Team4.setVisibility(View.VISIBLE);
                ply2Team4.setVisibility(View.VISIBLE);
                ply1Team5.setVisibility(View.VISIBLE);
                ply2Team5.setVisibility(View.VISIBLE);
                ply1Team6.setVisibility(View.VISIBLE);
                ply2Team6.setVisibility(View.VISIBLE);
                ply1Team7.setVisibility(View.VISIBLE);
                ply2Team7.setVisibility(View.VISIBLE);
                ply1Team8.setVisibility(View.VISIBLE);
                ply2Team8.setVisibility(View.VISIBLE);
                ply1Team9.setVisibility(View.VISIBLE);
                ply2Team9.setVisibility(View.VISIBLE);
                ply1Team10.setVisibility(View.VISIBLE);
                ply2Team10.setVisibility(View.VISIBLE);
                btnMac1.setVisibility(View.VISIBLE);
                btnMac2.setVisibility(View.VISIBLE);
                btnMac3.setVisibility(View.VISIBLE);
                btnMac4.setVisibility(View.VISIBLE);
                btnMac5.setVisibility(View.VISIBLE);
                btnMac6.setVisibility(View.VISIBLE);
                btnMac7.setVisibility(View.VISIBLE);
                btnMac8.setVisibility(View.VISIBLE);
                btnMac9.setVisibility(View.VISIBLE);
                btnMac10.setVisibility(View.VISIBLE);
                break;
        }
    }
}
