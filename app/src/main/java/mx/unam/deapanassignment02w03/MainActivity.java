package mx.unam.deapanassignment02w03;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Elementos declarados para el RecyclerView
    /*
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    */

    // Declarando elementos para FRAGMENT
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Código para RecyclerView, se moverá a RecyclerViewFragment
        /*
        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
        */


        // Para el actionbar
        //Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        //setSupportActionBar(miActionBar);

        // Casteo para views de FRAGMENT
        tabLayout =     (TabLayout) findViewById(R.id.tabLayout);
        viewPager =     (ViewPager) findViewById(R.id.viewPager);

        setUpViewPager();


    }   // Termina método onCreate



 /*
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


    // Método para botón de regreso
    public void irSegundaActividad(View v){
        Intent intent = new Intent(this, SegundaActividad.class);
        startActivity(intent);
    }
*/


// Métodos para menú
    // Método para menu opciones
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    // Método para las opciones del menú (contacto y acerca de)
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.mContacto:
                Intent intent = new Intent(this, ActivityContacto.class);
                startActivity(intent);
                break;
            case R.id.mAcercaDe:
                Intent intent1 = new Intent(this, ActivityAcercaDe.class);
                startActivity(intent1);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

// Métodos para Fragment
    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new RecyclerViewFragment());
        fragments.add(new PerfilFragment());

        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_dog_house_48);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_dog_year);
    }

    public void irSegundaActividad(View v){
        Intent intent = new Intent(this, SegundaActividad.class);
        startActivity(intent);
    }

}
