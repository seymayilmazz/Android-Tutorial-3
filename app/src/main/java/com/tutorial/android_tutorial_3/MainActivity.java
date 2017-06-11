package com.tutorial.android_tutorial_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button tikla1Button;
    private Button tikla2Button;
    private Button tikla3Button;
    private Button tikla4Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        tikla1Button= (Button) findViewById(R.id.tikla1Button);
        tikla2Button= (Button) findViewById(R.id.tikla2Button);
        tikla3Button= (Button) findViewById(R.id.tikla3Button);
        tikla4Button= (Button) findViewById(R.id.tikla4Button);


        tikla1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hallo Android World!", Toast.LENGTH_LONG).show();
            }
        });

        tikla2Button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this ,HelloActivity.class);
                startActivity(intent);
            }
        }));

        tikla3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this ,MathActivity.class);
                startActivity(intent);
            }
        });

    }
}
