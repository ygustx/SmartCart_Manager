package com.example.certo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FormCadasProdutos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadas_produtos);
    }

    public void cadastrarVoltar (View view){

        Intent i = new Intent(getApplicationContext(), FormEstoque.class);

        startActivity(i);
    }
}