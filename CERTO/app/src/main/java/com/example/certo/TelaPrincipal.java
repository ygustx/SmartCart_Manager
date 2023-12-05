package com.example.certo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
    }

    public void menuCaixa (View view){

        Intent i = new Intent(getApplicationContext(), FormAbrirCaixa.class);

        startActivity(i);
    }

    public void menuEstoque (View view){

        Intent i = new Intent(getApplicationContext(), FormEstoque.class);

        startActivity(i);
    }

    public void menuSair (View view){

        Intent i = new Intent(getApplicationContext(), FormLogin.class);

        startActivity(i);
    }
}