package com.example.laboratorio.movilproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Pro1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro1);

    }

    public void nota(View view) {
        EditText t1 = (EditText)findViewById(R.id.p1Text1);
        EditText t2 = (EditText)findViewById(R.id.p1Text2);
        EditText t3 = (EditText)findViewById(R.id.p1Text3);
        double valor1=Integer.valueOf(t1.getText().toString());
        double valor2=Integer.valueOf(t2.getText().toString());
        double valor3=Integer.valueOf(t3.getText().toString());
        double valor=valor1*0.5+valor2*0.25+valor3*0.25;
        //Toast.makeText(this,"Nota: "+valor,Toast.LENGTH_LONG).show();
        Intent returnvalor = new Intent();
        returnvalor.putExtra("Nota: ",valor);
        setResult(Activity.RESULT_OK,returnvalor);
        finish();

    }
}
