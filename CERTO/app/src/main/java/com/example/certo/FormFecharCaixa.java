package com.example.certo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FormFecharCaixa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_fechar_caixa);
    }

    public void caixaFechar (View view){

        Intent i = new Intent(getApplicationContext(), TelaPrincipal.class);

        startActivity(i);
    }
}