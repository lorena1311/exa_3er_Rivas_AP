package com.example.exa_3er_rivas_ap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public EditText etCodigo, etDescripcion, etUbicacion, etExistencia;
    public Button  btnAudioVideo;



    @Override
    protected void onCreate(Bundle savedInstanceState) { //Inicia metodo onCl¿reate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        btnAudioVideo=findViewById(R.id.btnAudioVideo);



        btnAudioVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AbrirAudioVideo= new Intent(view.getContext(),AudioVideo.class);
                startActivity(AbrirAudioVideo);
            }
        });
    } //Termina el metodo onCreate



   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }*/
}