package com.example.exa1_intermedio_volumen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    TextView angulo;
    Button btnCalcular;
    EditText editRadio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        seekBar = (SeekBar) findViewById(R.id.barra);
        angulo = findViewById(R.id.txtAngulo);
        btnCalcular = findViewById(R.id.btnCalcular);
        editRadio = findViewById(R.id.editRadio);


        seekBar.setProgress(0);
        seekBar.setMax(360);

        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        angulo.setText(""+progress);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );



        btnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double radio = Double.parseDouble(editRadio.getText().toString());
                double resultado = (0.666)*(seekBar.getProgress()*Math.pow(radio,3));
                Toast.makeText(getApplicationContext(),String.valueOf(resultado),Toast.LENGTH_LONG).show();
            }
        });
    }
}