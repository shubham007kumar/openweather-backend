package dev.shubham.openweather.services;

import dev.shubham.openweather.dtos.OpenWeatherResponseDto;
import dev.shubham.openweather.exceptions.CityNotFoundException;
import dev.shubham.openweather.exceptions.ForeCastException;
import dev.shubham.openweather.models.Forecast;
import dev.shubham.openweather.models.OpenWeather;

public interface WeatherService {
    public OpenWeather getWeather(String city, String units) throws CityNotFoundException;
    public Forecast getForecast(String lat,String lon,String units) throws ForeCastException;
}
