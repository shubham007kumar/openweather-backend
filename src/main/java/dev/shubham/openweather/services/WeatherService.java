package dev.shubham.openweather.services;

import dev.shubham.openweather.dtos.OpenWeatherResponseDto;
import dev.shubham.openweather.models.OpenWeather;

public interface WeatherService {
    public OpenWeather getWeather(String city, String units);
}
