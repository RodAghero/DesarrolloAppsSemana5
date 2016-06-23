package mx.unam.deapanassignment02w03;

import android.content.Context;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Roy on 19/06/2016.
 */
public class PerfilAdaptador extends RecyclerView.Adapter<PerfilAdaptador.PerfilViewHolder>  {

    ArrayList<Mascota> mascotaPerfil;

    // constructor
    public PerfilAdaptador(ArrayList<Mascota> mascotaPerfil){
        this.mascotaPerfil = mascotaPerfil;
    }

    @Override
    public PerfilViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_perfil_mascota, parent, false);
        return new PerfilViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PerfilViewHolder perfilViewHolder, int position) {
        Mascota mascota = mascotaPerfil.get(position);

        perfilViewHolder.imgFotoPerfil.setImageResource(mascota.getFoto());
        perfilViewHolder.tvNumeroCVPerfil.setText(mascota.getHuesos());
        perfilViewHolder.imgHuesoAmarilloPerfil.setImageResource(mascota.getHuesoAmarillo());

    }

    @Override
    public int getItemCount() {
        return mascotaPerfil.size();
    }



    public static class PerfilViewHolder extends RecyclerView.ViewHolder{
        // Declarar views de cardview_perfil_mascota
        private ImageView imgFotoPerfil;
        private TextView tvNumeroCVPerfil;
        private ImageView imgHuesoAmarilloPerfil;


        public PerfilViewHolder(View itemView) {
            super(itemView);
                imgFotoPerfil = (ImageView) itemView.findViewById(R.id.imgfotoPerfil);
                tvNumeroCVPerfil = (TextView) itemView.findViewById(R.id.tvNumeroCVPerfil);
                imgHuesoAmarilloPerfil = (ImageView) itemView.findViewById(R.id.imgHuesoAmarilloPerfil);
        }
    }

}
