package mx.unam.deapanassignment02w03;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class RecyclerViewFragment extends Fragment implements iRecyclerViewFragmentView {

    public RecyclerViewFragment() {
        // Required empty public constructor
    }

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    private iRecyclerViewFragmentPresenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        presenter = new RecyclerViewFragmentPresenter(this, getContext());

        /* Comentado y reubicado en los métodos de la interfaz
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
        */

        return v;

    }

    // Método para inicializar lista de mascotas
    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Dog01", R.drawable.dog01, "4", R.drawable.dog_bone_48, R.drawable.dog_bone_yellow));
        mascotas.add(new Mascota("Cat01", R.drawable.cat_head, "4", R.drawable.dog_bone_48, R.drawable.dog_bone_yellow));
        mascotas.add(new Mascota("Dog02", R.drawable.dog03, "4", R.drawable.dog_bone_48, R.drawable.dog_bone_yellow));
        mascotas.add(new Mascota("Llama01", R.drawable.llama_head, "4", R.drawable.dog_bone_48, R.drawable.dog_bone_yellow));
        mascotas.add(new Mascota("Cat02", R.drawable.grumpy_cat_head, "4", R.drawable.dog_bone_48, R.drawable.dog_bone_yellow));
    }

    // Método para el adaptador
    // Comentado y reubicado en métodos de la interfaz
    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }


    public void irSegundaActividad(View v){
        Intent intent = new Intent(getActivity(), SegundaActividad.class);
        startActivity(intent);
    }

    // Métodos para la base de datos

    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
    }

    @Override
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador) {
        listaMascotas.setAdapter(adaptador);
    }
}
