package com.herprogramacion.lawyersapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
    }
    public void BotonMochila(View view){
        Intent BotonMochila = new Intent(this, Mochila.class);
        startActivity(BotonMochila);
    }
    public void BotonEdificio(View view){
        Intent BotonEdificio = new Intent(this, Edificio.class);
        startActivity(BotonEdificio);
    }
    public void BotonDesinfeccion(View view){
        Intent BotonDesinfeccion = new Intent(this, Desinfeccion.class);
        startActivity(BotonDesinfeccion);
    }
    public void BotonDesPlomeria(View view){
        Intent BotonDesPlomeria = new Intent(this, Plomeria.class);
        startActivity(BotonDesPlomeria);
    }
    public void BotonDesContacto(View view){
        Intent BotonDesContacto = new Intent(this, Contacto.class);
        startActivity(BotonDesContacto);
    }
}
