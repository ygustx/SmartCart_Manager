package com.example.certo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FormEstoque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_estoque);
    }
    public void estoqueIncluir (View view){

        Intent i = new Intent(getApplicationContext(), FormCadasProdutos.class);

        startActivity(i);
    }

    public void estoqueSair (View view){

        Intent i = new Intent(getApplicationContext(), TelaPrincipal.class);

        startActivity(i);
    }
}