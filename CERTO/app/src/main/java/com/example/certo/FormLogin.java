package com.example.certo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    private TextView text_tela_cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        InciarComponente();

        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FormLogin.this, FormCadastro.class);
                startActivity(intent);

            }
        });

        }

    private void InciarComponente(){

        text_tela_cadastro = findViewById(R.id.text_tela_cadastro);
    }

    public void trocandoMenu (View view){

        Intent i = new Intent(getApplicationContext(), TelaPrincipal.class);

        startActivity(i);
    }
}