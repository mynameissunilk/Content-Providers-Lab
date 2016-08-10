package sunil.contentproviderlab.Network;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import sunil.contentproviderlab.StockList;


public interface ApiInterface {
    // a puny Retrofit interface
    // pretty neat nonetheless...

    @GET("Lookup/json/{input}/callback=myFunction")
    Call<StockList>getStockList(@Path("query") String query);

}
