package com.tutorial.android_tutorial_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MathActivity extends AppCompatActivity {

    public static final String LOG_TAG = MathActivity.class.getSimpleName();

    private EditText sayi1EditText;
    private EditText sayi2EditText;
    private Button   hesaplaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        Log.i(LOG_TAG, "onCreate metodu calisti");

        sayi1EditText= (EditText) findViewById(R.id.sayi1EditText);
        sayi2EditText= (EditText) findViewById(R.id.sayi2EditText);
        hesaplaButton= (Button) findViewById(R.id.hesaplaButton);

        hesaplaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1 = Integer.parseInt(sayi1EditText.getText().toString());
                int sayi2= Integer.parseInt( sayi2EditText.getText().toString());
                int sonuc=sayi1+sayi2;
                Log.w(LOG_TAG, "sonuc : " + sonuc);
                Toast.makeText(MathActivity.this , "sonuç: "+ sonuc ,Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_math, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        /* burada tiklanilan menu iteminin id'si aliniyor */
        int itemId = item.getItemId();

        if(itemId == R.id.action_settings){
            Toast.makeText(MathActivity.this, "Ayarlar", Toast.LENGTH_LONG).show();
        }
        else if(itemId == R.id.action_media){
            Toast.makeText(MathActivity.this, "Medya", Toast.LENGTH_LONG).show();
        }
        else if(itemId == R.id.action_new_group){
            Toast.makeText(MathActivity.this, "Yeni Grup", Toast.LENGTH_LONG).show();
        }
        else if(itemId == R.id.action_star_message){
            Toast.makeText(MathActivity.this, "Yıldızlı Mesajlar", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
