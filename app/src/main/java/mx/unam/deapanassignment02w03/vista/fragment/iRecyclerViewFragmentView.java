package mx.unam.deapanassignment02w03.vista.fragment;

import java.util.ArrayList;

import mx.unam.deapanassignment02w03.adapter.MascotaAdaptador;
import mx.unam.deapanassignment02w03.model.Mascota;

/**
 * Created by Roy on 25/06/2016.
 */
public interface iRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();

    public void generarGridLayout();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
