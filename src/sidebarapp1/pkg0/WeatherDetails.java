package sidebarapp1.pkg0;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;



public class WeatherDetails {
    
    String currentTemperatureInF;
    String currentWeatherCondition;
    
    String[] high = new String[10];
    String[] low = new String[10];
    String[] date = new String[10];
    String[] text = new String[10];
    
    Forecast[] forecast = new Forecast[10];
    

   WeatherDetails()
        {
              
            System.out.println("TEST");

        APIClient.getAPI().getWeather(new Callback<Weather>() {
            @Override
            public void success(Weather weather, Response response) {
                
                currentTemperatureInF = weather.getQuery().getResults().getChannel().getItem().getCondition().getTemp();
                currentWeatherCondition = weather.getQuery().getResults().getChannel().getItem().getCondition().getText();
                
                  int i = 0;
                
                for(Forecast f : weather.getQuery().getResults().getChannel().getItem().getForecast())
                    forecast[i++] = f;
                
                for(i = 0; i<=9; i++)
                {
                    high[i] = forecast[i].getHigh();
                    low[i] = forecast[i].getLow();
                    date[i] = forecast[i].getDate();
                    text[i] = forecast[i].getText();
                }
                
                
            }

            @Override
            public void failure(RetrofitError retrofitError) {
                retrofitError.printStackTrace();
            }
        });
           }

}