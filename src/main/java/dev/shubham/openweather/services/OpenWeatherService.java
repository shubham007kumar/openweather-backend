package dev.shubham.openweather.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.shubham.openweather.dtos.ForecastResponseDto;
import dev.shubham.openweather.dtos.OpenWeatherResponseDto;
import dev.shubham.openweather.models.Forecast;
import dev.shubham.openweather.models.OpenWeather;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenWeatherService implements WeatherService {

    private final RestTemplate restTemplate;

    private ModelMapper modelMapper;

    @Value("${weather.api.key}")
    private String appid;

    public OpenWeatherService(RestTemplate restTemplate,ModelMapper modelMapper){
        this.restTemplate = restTemplate;
        this.modelMapper = modelMapper;
    }
    @Override
    public OpenWeather getWeather(String city,String units) {
     ResponseEntity response =   restTemplate.getForEntity("https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+appid+"&units="+units, OpenWeatherResponseDto.class);
     OpenWeatherResponseDto openWeatherResponseDto = (OpenWeatherResponseDto) response.getBody();
        // if response come null throw error
        OpenWeather openWeather = modelMapper.map(openWeatherResponseDto,OpenWeather.class);
     return openWeather;
    }

    @Override
    public Forecast getForecast(String lat, String lon,String units) {
        ResponseEntity response =   restTemplate.getForEntity("https://api.openweathermap.org/data/2.5/forecast/daily?units="+units+"&lat="+lat+"&appid="+appid+"&lon="+lon, ForecastResponseDto.class);
        ForecastResponseDto forecastResponseDto = (ForecastResponseDto) response.getBody();
        // if response come null throw error
        Forecast forecast = modelMapper.map(forecastResponseDto,Forecast.class);
        return forecast;
    }
}
