package sunil.contentproviderlab.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sunil on 8/10/16.
 */

/*
     Following a tutorial that implements retrofit instance as a singleton.
     don't think it has to be, but this tutorial is the least scatterbrained ...
 */
public class ApiClient {

    public static final String baseURL = "http://dev.markitondemand.com/MODApis/Api/v2/";

    private static Retrofit sInstance = null;

    public static Retrofit getClientInstance(){
        if(sInstance == null){
            sInstance = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return sInstance;
    }
}
