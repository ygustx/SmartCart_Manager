package com.example.certo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FormFuncionario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_funcionario);
    }

    public void IncluirFuncionario (View view){

        Intent i = new Intent(getApplicationContext(), FormCadasFuncionario.class);

        startActivity(i);
    }

    public void ListarFuncionario (View view){

        Intent i = new Intent(getApplicationContext(), FormListarFunci.class);

        startActivity(i);
    }

    public void sairFuncionario (View view){

        Intent i = new Intent(getApplicationContext(), TelaPrincipal.class);

        startActivity(i);
    }
}