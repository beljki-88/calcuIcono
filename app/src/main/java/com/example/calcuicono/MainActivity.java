package com.example.calcuicono;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText datito1, datito2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        datito1 = findViewById(R.id.texto1);
        datito2 = findViewById(R.id.texto2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menusote, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Validar que los campos no estén vacíos
        if (datito1.getText().toString().isEmpty() || datito2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Ingresa ambos números", Toast.LENGTH_SHORT).show();
            return super.onOptionsItemSelected(item);
        }

        Clasesita objetito = new Clasesita();
        objetito.setNum1(Double.parseDouble(datito1.getText().toString()));
        objetito.setNum2(Double.parseDouble(datito2.getText().toString()));

        int id = item.getItemId();

        if (id == R.id.sumota || id == R.id.sumita) {
            objetito.suma();
            Toast.makeText(this, "Resultado: " + objetito.getResultado(), Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.restota || id == R.id.restita) {
            objetito.resta();
            Toast.makeText(this, "Resultado: " + objetito.getResultado(), Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.multiplicacionsota || id == R.id.multiplicacionsita) {
            objetito.multiplicacion();
            Toast.makeText(this, "Resultado: " + objetito.getResultado(), Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.divisionsota || id == R.id.divisionsita) {
            if (objetito.getNum2() == 0) {
                Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_LONG).show();
            } else {
                objetito.division();
                Toast.makeText(this, "Resultado: " + objetito.getResultado(), Toast.LENGTH_LONG).show();
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}