package mx.unam.deapanassignment02w03.restApi;

/**
 * Created by Roy on 09/07/2016.
 */
public class ConstantesRestApi {

    public static final String VERSION      = "/v1/";
    public static final String ROOT_URL     = "https://api.instagram.com" + VERSION;
    public static final String ACCESS_TOKEN = "3502625180.755806d.df37b1a407bf439cb4f5e6f3418f2aa9";

    // url para obtener users/self/media/recent --> https://api.instagram.com/v1/users/self/media/recent/?access_token=ACCESS-TOKEN
    public static final String KEY_ACCESS_TOKEN             = "?access_token=";
    public static final String KEY_GET_RECENT_MEDIA_USER    = "users/3470121575/media/recent/";

    // url completo
    public static final String URL_GET_RECENT_MEDIA_USER = KEY_GET_RECENT_MEDIA_USER + KEY_ACCESS_TOKEN + ACCESS_TOKEN;
}



