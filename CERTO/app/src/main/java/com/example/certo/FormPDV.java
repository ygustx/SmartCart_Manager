package com.example.certo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FormPDV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pdv);
    }

    public void FinalizarCaixa (View view){

        Intent i = new Intent(getApplicationContext(), FormFecharCaixa.class);

        startActivity(i);
    }
}