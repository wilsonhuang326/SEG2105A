package com.example.sport_centricmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView avatarImage;
    TextView  appTitle, teamName, teamNa,zipCode, teamadress;
    Button mapOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        avatarImage=(ImageView) findViewById(R.id.avatar);
        appTitle=(TextView)findViewById(R.id.appTitle);
        teamNa=(TextView)findViewById(R.id.textNa);
        teamName=(TextView)findViewById(R.id.teamName);
        zipCode=(TextView)findViewById(R.id.zipCode);
        teamadress=(TextView)findViewById(R.id.teamAdress);

        mapOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnOpenInGoogleMaps(v);
            }
        });
        avatarImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSetAvatar(v);
            }
        });
    }


    public void onSetAvatar(View view){
        Intent intent = new Intent(getApplicationContext(),profile.class);
        startActivityForResult(intent,0);
    }

    public void OnOpenInGoogleMaps(View view){
        EditText teamAddress = (EditText) findViewById(R.id.zipCode);
        Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q=" + zipCode.getText());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_CANCELED) return;
        ;
        ImageView avatarImage = (ImageView) findViewById(R.id.avatar);

        String drawableName = "ic_logo_00";
        switch (data.getIntExtra("imageID", R.id.teamid00)){
            case R.id.teamid00:
                drawableName = "ic_logo_00";
                break;
            case R.id.teamid01:
                drawableName = "ic_logo_01";
                break;
            case R.id.teamid02:
                drawableName = "ic_logo_02";
                break;
            case R.id.teamid03:
                drawableName = "ic_logo_03";
                break;
            case R.id.teamid04:
                drawableName = "ic_logo_04";
                break;
            case R.id.teamid05:
                drawableName = "ic_logo_05";
                break;
            default:
                drawableName = "ic_logo_00";
                break;
        }
        int resID = getResources().getIdentifier(drawableName, "drawable", getPackageName());
        avatarImage.setImageResource(resID);
    }
}