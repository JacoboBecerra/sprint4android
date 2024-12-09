package com.example.mycatalog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

public class InicioFragment extends Fragment {

    public InicioFragment() {
        // Constructor vacío
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla el layout para este fragmento
        View view = inflater.inflate(R.layout.fragment_inicio, container, false);

        // Encuentra el botón por su ID
        Button btnNavigateToDetail = view.findViewById(R.id.btnNavigateToDetail);

        // Establece un OnClickListener para el botón
        btnNavigateToDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Muestra un mensaje Toast al hacer clic en el botón
                Toast.makeText(getActivity(), "Pulsa el botón de información", Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }
}