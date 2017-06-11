package com.tutorial.android_tutorial_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HelloActivity extends AppCompatActivity {

    private Button mesajVerButon;
    private EditText isimEditText;
    private EditText soyisimEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hello);

        mesajVerButon= (Button) findViewById(R.id.mesajVerButton);
        isimEditText= (EditText) findViewById(R.id.isimEditText);
        soyisimEditText= (EditText) findViewById(R.id.soyIsimEditText);

        mesajVerButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mesajVer();
            }
        });

    }

    private void mesajVer(){

        String isim= isimEditText.getText().toString();
        String soyisim= soyisimEditText.getText().toString();

        if (isim.length() == 0){
            Toast.makeText(HelloActivity.this, "isim boş geçilemez" , Toast.LENGTH_LONG)
                    .show();
        }
        else if (soyisim.length()==0){
            Toast.makeText(HelloActivity.this, "soyisim boş geçilemez" , Toast.LENGTH_LONG)
                    .show();
        }
        else{
            String mesaj= "Merhaba " + isim + " " + soyisim;
            Toast.makeText(HelloActivity.this, mesaj,Toast.LENGTH_LONG).show();
        }

    }
}
