/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidebarapp1.pkg0;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;

/**
 * Created by chipset on 5/4/16.
 */
public class APIClient {
    
    public static YahooWeather yahooWeather = null;

    public static YahooWeather getAPI() {
        if (yahooWeather == null) {
            RestAdapter adapter = new RestAdapter.Builder()
                    .setEndpoint("https://query.yahooapis.com/v1/public")
                    .build();

            yahooWeather = adapter.create(YahooWeather.class);
        }
        return yahooWeather;
    }

    public interface YahooWeather {
        
        @GET("/yql?format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22Manipal%22)")
        void getWeather(Callback<Weather> weatherCallback);
    }
}