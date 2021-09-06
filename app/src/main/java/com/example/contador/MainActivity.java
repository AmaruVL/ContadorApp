package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementarContador(View vista){
        contador++;
        modificarContador();
    }
    public void decrementarContador(View vista){
        contador--;
        modificarContador();
    }
    public void resetearContador(View vista){
        contador = 0;
        modificarContador();
    }
    public void modificarContador(){
        TextView textoResultado = (TextView)findViewById(R.id.txtContador);
        textoResultado.setText("Contador: "+ contador);
    }
}