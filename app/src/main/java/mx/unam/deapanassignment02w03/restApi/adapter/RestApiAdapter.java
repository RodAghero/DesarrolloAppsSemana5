package mx.unam.deapanassignment02w03.restApi.adapter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import mx.unam.deapanassignment02w03.restApi.ConstantesRestApi;
import mx.unam.deapanassignment02w03.restApi.EndpointsApi;
import mx.unam.deapanassignment02w03.restApi.Model.MascotaResponse;
import mx.unam.deapanassignment02w03.restApi.deserializador.MascotaDeserializador;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Roy on 09/07/2016.
 */
public class RestApiAdapter {

    public EndpointsApi establecerConexionRestApiInstagram(Gson gson){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApi.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(EndpointsApi.class);
    }

    public Gson construyendoGsonDeserializadorMediaRecent(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(MascotaResponse.class, new MascotaDeserializador());
        return gsonBuilder.create();
    }

}
