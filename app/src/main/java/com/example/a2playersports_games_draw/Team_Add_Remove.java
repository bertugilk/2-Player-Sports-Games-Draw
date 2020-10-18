package com.example.a2playersports_games_draw;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Team_Add_Remove extends AppCompatActivity {
    Context context=this;
    EditText teamName;
    Spinner teams;
    Button btnAdd,btnDel,btnSave;
    Bundle bundle;
    Intent intent;
    int a=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_add_remove_screen);
        init();
        Bundle data=getIntent().getExtras();
        final String name1=data.getString("plyr1Name");
        final String name2=data.getString("plyr2Name");
        final String macSayisi=data.getString("macSayisi") ;

        final ArrayList<String> teamList=new ArrayList<>();
        teamList.add("FENERBAHÇE");

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=teamName.getText().toString();
                if(name.equals("")){
                    Toast.makeText(context,"Bir takım ismi girin!!!",Toast.LENGTH_SHORT).show();
                }else{
                    teamList.add(name);
                    teamName.setText("");
                }
            }
        });

        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,teamList);
        teams.setAdapter(adapter);

        teams.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, final int position, long l) {
                final String item=adapterView.getItemAtPosition(position).toString();
                btnDel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(teamList.isEmpty()){
                            Toast.makeText(context,"Liste boş!!!",Toast.LENGTH_SHORT).show();
                        }else{
                            teamList.remove(item);
                            adapter.notifyDataSetChanged();
                        }
                    }
                });
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        matchNumbers(macSayisi);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(teamList.isEmpty() || teamList.size()<2*a) {
                    Toast.makeText(context, "Torba'da Yeterli Sayıda Takım Yok!!!", Toast.LENGTH_SHORT).show();
                }
                else {
                    intent=new Intent(context,DrawLots.class);
                    bundle=new Bundle();
                    bundle.putStringArrayList("teams",teamList);
                    bundle.putString("name1",String.valueOf(name1));
                    bundle.putString("name2",String.valueOf(name2));
                    bundle.putString("macSayisi",String.valueOf(macSayisi));
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });
    }

    public void init(){
        teamName=findViewById(R.id.teamName);
        teams=findViewById(R.id.teams);
        btnAdd=findViewById(R.id.btnAdd);
        btnDel=findViewById(R.id.btnDel);
        btnSave=findViewById(R.id.btnSave);
    }

    public void matchNumbers(String number){
        switch (number){
            case "0":
                a=1;
                break;
            case "1":
                a=2;
                break;
            case "2":
                a=3;
                break;
            case "3":
                a=4;
                break;
            case "4":
                a=5;
                break;
            case "5":
                a=6;
                break;
            case "6":
                a=7;
                break;
            case "7":
                a=8;
                break;
            case "8":
                a=9;
                break;
            case "9":
                a=10;
                break;
        }
    }
}
