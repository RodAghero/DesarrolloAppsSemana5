package mx.unam.deapanassignment02w03;

import java.util.ArrayList;

/**
 * Created by Roy on 25/06/2016.
 */
public interface iRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
