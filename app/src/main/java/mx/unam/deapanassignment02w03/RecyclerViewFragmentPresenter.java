package mx.unam.deapanassignment02w03;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Roy on 25/06/2016.
 */
public class RecyclerViewFragmentPresenter implements iRecyclerViewFragmentPresenter {

    private iRecyclerViewFragmentView interfaceRecyclerViewFragmentView;
    private Context context;

    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenter(iRecyclerViewFragmentView interfaceRecyclerViewFragmentView, Context context) {
        this.interfaceRecyclerViewFragmentView = interfaceRecyclerViewFragmentView;
        this.context = context;

        obtenerMascotasBaseDatos();
    }

    @Override
    public void obtenerMascotasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();

        mostrarMascotasRV();
    }

    @Override
    public void mostrarMascotasRV() {
        interfaceRecyclerViewFragmentView.inicializarAdaptadorRV(interfaceRecyclerViewFragmentView.crearAdaptador(mascotas));
        interfaceRecyclerViewFragmentView.generarLinearLayoutVertical();
    }
}
