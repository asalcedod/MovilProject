package com.example.laboratorio.movilproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void onClickp1(View view) {
        Intent i = new Intent(this,Pro1.class);
        startActivityForResult(i,1);
    }
    public void onClickp2(View view) {
        Intent i = new Intent(this,Pro1.class);
        startActivityForResult(i,1);
    }
    public void onClickp3(View view) {
        Intent i = new Intent(this,Pro1.class);
        startActivityForResult(i,1);
    }
    public void onClickp4(View view) {
        Intent i = new Intent(this,Pro1.class);
        startActivityForResult(i,1);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1){
            if (resultCode==RESULT_OK){
                double nota=data.getDoubleExtra("Nota: ",0);
                TextView tv = (TextView) findViewById(R.id.r);
                tv.setText("Nota: "+nota);
                Toast.makeText(this,"Nota: "+nota,Toast.LENGTH_LONG).show();
            }
        }
    }
}
