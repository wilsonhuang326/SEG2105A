package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView title;
    ImageView teamid00, teamid01, teamid02, teamid03, teamid04, teamid05;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        title = (TextView) findViewById(R.id.title);
        teamid00 = (ImageView) findViewById(R.id.teamid00);
        teamid01 = (ImageView) findViewById(R.id.teamid01);
        teamid02 = (ImageView) findViewById(R.id.teamid02);
        teamid03 = (ImageView) findViewById(R.id.teamid03);
        teamid04 = (ImageView) findViewById(R.id.teamid04);
        teamid05 = (ImageView) findViewById(R.id.teamid05);
        teamid00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTeamIcon(v);
            }
        });teamid01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTeamIcon(v);
            }
        });teamid02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTeamIcon(v);
            }
        });teamid03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTeamIcon(v);
            }
        });teamid04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTeamIcon(v);
            }
        });teamid05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTeamIcon(v);
            }
        });
    }

    public void setTeamIcon(View view) {
        Intent returnIntent = new Intent();
        ImageView selectedImage = (ImageView) view;
        returnIntent.putExtra("imageID", selectedImage.getId());
        setResult(RESULT_OK, returnIntent);
        finish();
    }
}