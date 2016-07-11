package mx.unam.deapanassignment02w03.presentador;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;

import mx.unam.deapanassignment02w03.vista.fragment.iRecyclerViewFragmentView;
import mx.unam.deapanassignment02w03.model.ConstructorMascotas;
import mx.unam.deapanassignment02w03.model.Mascota;
import mx.unam.deapanassignment02w03.restApi.EndpointsApi;
import mx.unam.deapanassignment02w03.restApi.Model.MascotaResponse;
import mx.unam.deapanassignment02w03.restApi.adapter.RestApiAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        //obtenerMascotasBaseDatos();
        obtenerMediosRecientes();
    }

    @Override
    public void obtenerMascotasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();
        mostrarMascotasRV();
    }

    @Override
    public void obtenerMediosRecientes() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();

        Gson gsonMediaRecent = restApiAdapter.construyendoGsonDeserializadorMediaRecent();
        EndpointsApi endpointsApi = restApiAdapter.establecerConexionRestApiInstagram(gsonMediaRecent);

        Call<MascotaResponse> mascotaResponseCall = endpointsApi.getRecentMedia();

        mascotaResponseCall.enqueue(new Callback<MascotaResponse>() {
            @Override
            public void onResponse(Call<MascotaResponse> call, Response<MascotaResponse> response) {
                MascotaResponse mascotaResponse = response.body();
                mascotas = mascotaResponse.getMascotas();
                mostrarMascotasRV();
            }

            @Override
            public void onFailure(Call<MascotaResponse> call, Throwable t) {
                Toast.makeText(context, "Problema de conexión, intenta de nuevo", Toast.LENGTH_LONG).show();
                Log.e("FALLA EN LA CONEXIÓN", t.toString());

            }
        });

    }

    @Override
    public void mostrarMascotasRV() {
        interfaceRecyclerViewFragmentView.inicializarAdaptadorRV(interfaceRecyclerViewFragmentView.crearAdaptador(mascotas));
        interfaceRecyclerViewFragmentView.generarGridLayout();
    }
}
