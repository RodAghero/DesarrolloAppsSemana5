package mx.unam.deapanassignment02w03.restApi;

import mx.unam.deapanassignment02w03.restApi.Model.MascotaResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Roy on 09/07/2016.
 */
public interface EndpointsApi {

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER)

    Call<MascotaResponse> getRecentMedia();

}
