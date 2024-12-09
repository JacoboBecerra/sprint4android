package com.example.mycatalog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FavoritosFragment extends Fragment {

    public FavoritosFragment() {
        // Constructor vacío
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla el layout para este fragmento
        View view = inflater.inflate(R.layout.fragment_favoritos, container, false);

        // Encuentra el ImageView y el botón por su ID
        ImageView imageView = view.findViewById(R.id.imageView);
        Button btnMeGusta = view.findViewById(R.id.btnMeGusta);

        // Establece la imagen en el ImageView
        imageView.setImageResource(R.drawable.perro);

        // Establece un OnClickListener para el botón
        btnMeGusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Muestra un mensaje Toast al hacer clic en el botón
                Toast.makeText(getActivity(), "Me Gusta", Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }
}