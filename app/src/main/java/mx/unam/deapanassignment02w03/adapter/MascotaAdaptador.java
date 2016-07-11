package mx.unam.deapanassignment02w03.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import mx.unam.deapanassignment02w03.DetalleMascota;
import mx.unam.deapanassignment02w03.model.Mascota;
import mx.unam.deapanassignment02w03.R;

/**
 * Created by Roy on 12/06/2016.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;

   // Constructor recibe arreglo y activity
    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_grid_mascota, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);

        //mascotaViewHolder.imgFoto.setImageResource(mascota.getUrlFoto());

        Picasso.with(activity)
                .load(mascota.getUrlFoto())
                .placeholder(R.drawable.grumpy_cat_head)
                .into(mascotaViewHolder.imgFoto);

        //mascotaViewHolder.imgHuesoBlanco.setImageResource(mascota.getHuesoBlanco());
        //mascotaViewHolder.tvNombreCV.setText(mascota.getNombre());
        //mascotaViewHolder.tvNumeroCV.setText(mascota.getHuesos());
        //mascotaViewHolder.imgHuesoAmarillo.setImageResource(mascota.getHuesoAmarillo());
        mascotaViewHolder.tvLikesCV.setText(String.valueOf(mascota.getLikes()));


        mascotaViewHolder.imgFoto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Toast.makeText(activity, mascota.getNombre(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(activity,DetalleMascota.class);
                intent.putExtra("url", mascota.getUrlFoto());
                intent.putExtra("like", mascota.getLikes());
                activity.startActivity(intent);

            }
        });

        /*
        mascotaViewHolder.imgHuesoAmarillo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Diste Like a " + mascota.getNombre(), Snackbar.LENGTH_SHORT).show();

                ConstructorMascotas constructorMascotas = new ConstructorMascotas(activity);
                constructorMascotas.darLikeMascota(mascota);

                mascotaViewHolder.tvLikesCV.setText(Integer.toString(constructorMascotas.obtenerLikesMascota(mascota)));
            }
        });
        */
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        //private ImageView imgHuesoBlanco;
        //private TextView tvNombreCV;
        //private TextView tvNumeroCV;
        //private ImageButton imgHuesoAmarillo;
        private TextView tvLikesCV;

        public MascotaViewHolder(View itemView) {
            super(itemView);
                imgFoto   = (ImageView) itemView.findViewById(R.id.imgFoto);
                //imgHuesoBlanco = (ImageView) itemView.findViewById(R.id.imgHuesoBlanco);
                //tvNombreCV = (TextView) itemView.findViewById(R.id.tvNombreCV);
                //tvNumeroCV = (TextView) itemView.findViewById(R.id.tvNumeroCV);
                //imgHuesoAmarillo = (ImageButton) itemView.findViewById(R.id.imgHuesoAmarillo);
                tvLikesCV = (TextView) itemView.findViewById(R.id.tvLikesCV);
        }
    }
}
