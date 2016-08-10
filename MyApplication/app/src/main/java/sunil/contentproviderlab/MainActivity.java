package sunil.contentproviderlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.HttpUrl;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Path;
import sunil.contentproviderlab.Network.ApiClient;
import sunil.contentproviderlab.Network.ApiInterface;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //String query = edittext.gettext.tostring

        ApiInterface retrofitService = ApiClient.getClientInstance().create(ApiInterface.class);
        Call<StockList> call = retrofitService.getStockList(query);
        call.enqueue(new Callback<StockList>() {
            @Override
            public void onResponse(Call<StockList> call, Response<StockList> response) {

            }

            @Override
            public void onFailure(Call<StockList> call, Throwable t) {

            }
        });


        /*
        HttpUrl.Builder urlBuilder = HttpUrl.parse(baseURL).newBuilder();
        urlBuilder.addQueryParameter("input",query);
        String url = urlBuilder.build().toString();
        */


        // specify a factory for deserializing the response using Gson
        /*Gson gson = new GsonBuilder()
                .create();
        */

    }
}
