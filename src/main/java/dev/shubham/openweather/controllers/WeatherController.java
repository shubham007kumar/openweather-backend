package dev.shubham.openweather.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {
    private RestTemplate restTemplate;
    public WeatherController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public void getWeather(){

    }
}
