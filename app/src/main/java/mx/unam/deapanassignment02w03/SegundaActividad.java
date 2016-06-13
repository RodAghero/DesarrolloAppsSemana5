package mx.unam.deapanassignment02w03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class SegundaActividad extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

        // Para el actionbar
        //Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        //setSupportActionBar(miActionBar);

        // Para botón de regreso
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

}
