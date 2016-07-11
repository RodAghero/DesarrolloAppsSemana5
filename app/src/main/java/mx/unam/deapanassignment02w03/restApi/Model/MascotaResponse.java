package mx.unam.deapanassignment02w03.restApi.Model;

import java.util.ArrayList;

import mx.unam.deapanassignment02w03.model.Mascota;

/**
 * Created by Roy on 09/07/2016.
 */
public class MascotaResponse {
    ArrayList<Mascota> mascotas;

    public ArrayList<Mascota> getMascotas(){
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;
    }

}
