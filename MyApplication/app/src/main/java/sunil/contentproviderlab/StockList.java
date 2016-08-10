package sunil.contentproviderlab;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunil on 8/9/16.
 */

public class StockList {
    // although a correct query for a stock ticker returns a single stock, it's a single-element array...
    // let's see if this works...

    // there is no given name for the array
    // or is it @JSONignore?
    @SerializedName("")
    ArrayList<Stock>Portfolio;

    public StockList(){
        Portfolio = new ArrayList<Stock>();
    }


    public static StockList parseJSON(String response){
        Gson gson = new GsonBuilder().create();
        StockList stockList = gson.fromJson(response,StockList.class);
        return stockList;
    }

    public ArrayList<Stock> getStockList(){
        return Portfolio;
    }
}
