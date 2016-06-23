package mx.unam.deapanassignment02w03;

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


public class PerfilFragment extends Fragment {

    public PerfilFragment() {
        // Required empty public constructor
    }

    ArrayList<Mascota> mascotas;
    private RecyclerView perfilMascotas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        perfilMascotas = (RecyclerView) v.findViewById(R.id.rvPerfil);

        GridLayoutManager glm = new GridLayoutManager(getActivity(), 3);
        glm.setOrientation(GridLayoutManager.HORIZONTAL);

        /*
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        */

        perfilMascotas.setLayoutManager(glm);
        inicializarListaMascotas();
        inicializarAdaptador();

        return v;

    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.dog01, "4", R.drawable.dog_bone_yellow));
        mascotas.add(new Mascota(R.drawable.dog01, "4", R.drawable.dog_bone_yellow));
        mascotas.add(new Mascota(R.drawable.dog01, "4", R.drawable.dog_bone_yellow));
        mascotas.add(new Mascota(R.drawable.dog01, "4", R.drawable.dog_bone_yellow));
        mascotas.add(new Mascota(R.drawable.dog01, "4", R.drawable.dog_bone_yellow));
        mascotas.add(new Mascota(R.drawable.dog01, "4", R.drawable.dog_bone_yellow));
        mascotas.add(new Mascota(R.drawable.dog01, "4", R.drawable.dog_bone_yellow));
        mascotas.add(new Mascota(R.drawable.dog01, "4", R.drawable.dog_bone_yellow));
        mascotas.add(new Mascota(R.drawable.dog01, "4", R.drawable.dog_bone_yellow));
    }

    public void inicializarAdaptador(){
        PerfilAdaptador adaptador = new PerfilAdaptador(mascotas);
        perfilMascotas.setAdapter(adaptador);
    }

}
