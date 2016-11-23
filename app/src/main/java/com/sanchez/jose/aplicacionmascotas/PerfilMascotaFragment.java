package com.sanchez.jose.aplicacionmascotas;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class PerfilMascotaFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil_mascota, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvPerfil);

        GridLayoutManager llm = new GridLayoutManager(getActivity(),3);
        llm.setOrientation(LinearLayoutManager.VERTICAL);


        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }




    public void inicializarAdaptador() {
        PerfilMascotaAdaptador adaptador = new PerfilMascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }


    public void inicializarListaMascotas() {
        mascotas = new ArrayList<Mascota>();

        if (Mascota.mascotasPerfilArray.size() == 0) {
            Mascota.mascotasPerfilArray.add(new Mascota("Pirulin", false, 5, R.drawable.perfil1));
            Mascota.mascotasPerfilArray.add(new Mascota("Pirulin", false, 8, R.drawable.perfil2));
            Mascota.mascotasPerfilArray.add(new Mascota("Pirulin", false, 4, R.drawable.perfil3));
            Mascota.mascotasPerfilArray.add(new Mascota("Pirulin", false, 12, R.drawable.perfil4));
            Mascota.mascotasPerfilArray.add(new Mascota("Pirulin", false, 2, R.drawable.perfil5));
            Mascota.mascotasPerfilArray.add(new Mascota("Pirulin", false, 4, R.drawable.perfil6));
            Mascota.mascotasPerfilArray.add(new Mascota("Pirulin", false, 9, R.drawable.perfil7));
            Mascota.mascotasPerfilArray.add(new Mascota("Pirulin", false, 4, R.drawable.perfil8));
            Mascota.mascotasPerfilArray.add(new Mascota("Pirulin", false, 6, R.drawable.perfil9));
            Mascota.mascotasPerfilArray.add(new Mascota("Pirulin", false, 7, R.drawable.perfil10));
        }

        mascotas = Mascota.mascotasPerfilArray;

    }


}
