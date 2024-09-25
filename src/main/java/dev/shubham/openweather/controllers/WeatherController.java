package dev.shubham.openweather.controllers;

import dev.shubham.openweather.dtos.OpenWeatherResponseDto;
import dev.shubham.openweather.models.OpenWeather;
import dev.shubham.openweather.services.OpenWeatherService;
import dev.shubham.openweather.services.WeatherService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {
    private RestTemplate restTemplate;
    private WeatherService weatherService;
    public WeatherController(RestTemplate restTemplate,WeatherService weatherService){
        this.restTemplate = restTemplate;
        this.weatherService = weatherService;
    }



    @GetMapping("/weather/{city}/{units}")
    public ResponseEntity<OpenWeather> getWeather(@PathVariable("city") String city, @PathVariable("units") String units){
        OpenWeather openWeather = weatherService.getWeather(city,units);
        ResponseEntity<OpenWeather> response = new ResponseEntity<>(openWeather, HttpStatusCode.valueOf(200));
        return response;
    }
}
