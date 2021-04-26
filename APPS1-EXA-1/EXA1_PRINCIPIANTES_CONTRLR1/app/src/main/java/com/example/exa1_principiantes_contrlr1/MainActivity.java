package com.example.exa1_principiantes_contrlr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtApps, txtExamen, txtEvaluacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        txtApps = findViewById(R.id.txtApps);
        txtApps.setText("APLICACIONES 1");
        txtExamen = findViewById(R.id.txtExamen);
        txtExamen.setText("EXAMEN PRÁCTICO");
        txtEvaluacion = findViewById(R.id.txtEvaluacion);
        txtEvaluacion.setText("1RA EVALUACIÓN PARCIAL");
    }
}