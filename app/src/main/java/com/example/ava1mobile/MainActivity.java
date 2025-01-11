package com.example.ava1mobile;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText editTextA1, editTextA2, editTextA3;
TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editTextA1 = findViewById(R.id.ed_A1);
        editTextA2 = findViewById(R.id.ed_A2);
        editTextA3 = findViewById(R.id.ed_A3);
        txtResultado = findViewById(R.id.txt_resultado);
    }
    public void calcularMedia(View v){

        double a1 = Double.parseDouble(editTextA1.getText().toString());

        double a2 = Double.parseDouble(editTextA2.getText().toString());

        if(a1 == 0){
            txtResultado.setText("Reprovado");
        }
        double mediaFinal = (a1 * 0.4) + (a2 * 0.6);

        if(mediaFinal < 6){
            double a3 = Double.parseDouble(editTextA3.getText().toString());
            mediaFinal = (a1 * 0.4) + (a3 * 0.6);
        }
        if(mediaFinal >= 6){
            txtResultado.setText("Aprovado: %.2f"+ mediaFinal);
        }
        else{
            txtResultado.setText("Reprovado: %.2f" + mediaFinal);
        }
    }
}