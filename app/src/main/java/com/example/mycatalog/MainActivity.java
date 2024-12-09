package com.example.mycatalog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Vinculamos el diseño XML

        // Encontramos el botón por su ID
        Button btnNavigateToDetail = findViewById(R.id.btnNavigateToDetail);

        // Establecemos un OnClickListener para el botón
        btnNavigateToDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Muestra un mensaje Toast al hacer clic en el botón
                Toast.makeText(MainActivity.this, "Navegando al detalle...", Toast.LENGTH_SHORT).show();

                // Aquí puedes agregar la lógica para navegar a una nueva actividad (detalle)
                // Por ejemplo, si tienes una actividad llamada DetailActivity:
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });
    }
}