package com.example.eva1_acredita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
implements SeekBar.OnSeekBarChangeListener{

    ImageView img1, img2, img3;
    TextView txtAcredita, txtPuntosVal, txtCalifaVal;
    SeekBar brPuntos, brCalifa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);

        img1.setImageResource(R.drawable.img1);
        img2.setImageResource(R.drawable.img2);
        img3.setImageResource(R.drawable.img3);

        txtAcredita = findViewById(R.id.txtAcredita);
        txtCalifaVal = findViewById(R.id.txtCalifaVal);
        txtPuntosVal = findViewById(R.id.txtPuntosVal);

        brCalifa = findViewById(R.id.brCalifa);
        brPuntos = findViewById(R.id.brPuntos);

        brCalifa.setOnSeekBarChangeListener(this);
        brPuntos.setOnSeekBarChangeListener(this);

    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        int puntos = brPuntos.getProgress();
        int califa = brCalifa.getProgress();
        if(califa>=puntos){
            txtAcredita.setText("ACREDITADO");
        }else{
            txtAcredita.setText("NO ACREDITADO");
        }
        txtCalifaVal.setText(califa + "");
        txtPuntosVal.setText(puntos + "");
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}