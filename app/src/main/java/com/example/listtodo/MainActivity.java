package com.example.listtodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button botao_login;
    Button botao_cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao_login = findViewById(R.id.btn_fazer_login);
        botao_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(getApplicationContext(), Login.class);
                startActivity(ii);
            }
        });

        botao_cadastro = findViewById(R.id.btn_fazer_cadastro);
        botao_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(getApplicationContext(), Cadastro.class);
                startActivity(ii);
            }
        });
    }
}