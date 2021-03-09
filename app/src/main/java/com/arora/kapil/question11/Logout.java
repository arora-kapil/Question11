package com.arora.kapil.question11;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Logout extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";
    Button popupRequest=null;
    Button popupCal=null;
    Context myContext=null;
    AlertDialog.Builder adb=null;
    AlertDialog ad=null;
    TextView responses=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("Welcome "+messageText);

        Intent intent1 = new Intent(this, Login.class);

        adb=new AlertDialog.Builder(this);
        adb.setCancelable(false);
        adb.setMessage("Are you sure you want to EXIT?");
        adb.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface di, int id) {
                startActivity(intent1);
            }
        });
        adb.setNegativeButton("No", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface di, int id){
            }
        });
        ad=adb.create();
        ad.setTitle("Are you sure you want to EXIT?");
        popupRequest=(Button)findViewById(R.id.logout);
        popupRequest.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                ad.show();
            }
        });
    }
}