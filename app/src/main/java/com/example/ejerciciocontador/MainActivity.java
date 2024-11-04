package com.example.ejerciciocontador;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Crear variables y objetos que vayamos a necesitar

    private int contador=0;
    private TextView contadorTextView;
    private Button botonContar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asociar el objeto al elemento correspondiente XML
        contadorTextView=findViewById(R.id.textView);
        botonContar=findViewById(R.id.button);

        botonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                contadorTextView.setText(Integer.toString(contador));
            }
        });

    }
}