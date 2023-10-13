package com.example.projectx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projectx.R;

public class Counselling extends AppCompatActivity {

    Button trp,mdhlp,tsup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counselling);

        trp=(Button) findViewById(R.id.trp);
        trp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), Dipression.class);
                startActivity(i);
            }
        });

        mdhlp=(Button) findViewById(R.id.mdhlp);
        mdhlp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), Dipression.class);
                startActivity(i);
            }
        });


    }


}