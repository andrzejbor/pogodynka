package sample.service;

import sample.model.Weather;

/**
 * Created by Andrzej on 17.11.2016.
 */
public interface WeatherService {

    Weather getWeatherFromUrl(String url);

}
