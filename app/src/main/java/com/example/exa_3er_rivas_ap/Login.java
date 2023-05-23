package com.example.exa_3er_rivas_ap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity { //Inicio clase

    public EditText etUsuario, etPassword;
    public Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Inicia OCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Integracion de XML JAVA
        etUsuario=findViewById(R.id.etUsuario);
        etPassword=findViewById(R.id.etPassword);
        btnEntrar=findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etUsuario.getText().toString().equals("admin") && etPassword.getText().toString().equals("uacm123")){//condicion si se cumple es decir es verdadera
                    Intent intent1 = new Intent(view.getContext(),MainActivity.class);
                    startActivityForResult(intent1,0);
                }else{//condicion falsa
                    Toast.makeText(Login.this,"Usuario y/o Contraseña incorrectos\nVerifica!!",Toast.LENGTH_LONG).show();
                }
            }
        });

    } //Termina OnCreate
} //Termina clase