package dev.shubham.openweather.controllers;

import dev.shubham.openweather.dtos.OpenWeatherResponseDto;
import dev.shubham.openweather.models.Forecast;
import dev.shubham.openweather.models.OpenWeather;
import dev.shubham.openweather.services.OpenWeatherService;
import dev.shubham.openweather.services.WeatherService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {
    private RestTemplate restTemplate;
    private WeatherService weatherService;

    private RedisTemplate<String,Object> redisTemplate;
    public WeatherController(RestTemplate restTemplate,
                             WeatherService weatherService,
                             RedisTemplate<String,Object> redisTemplate
                             ){
        this.restTemplate = restTemplate;
        this.weatherService = weatherService;
        this.redisTemplate = redisTemplate;
    }



    @GetMapping("/weather")
    public ResponseEntity<OpenWeather> getWeather(@RequestParam("q") String city, @RequestParam("units") String units){
        OpenWeather openWeather = (OpenWeather) redisTemplate.opsForHash().get("weather","weather"+city);
        if(openWeather != null){
            return new ResponseEntity<>(openWeather,HttpStatusCode.valueOf(200));
        }
         openWeather = weatherService.getWeather(city,units);
        redisTemplate.opsForHash().put("weather","weather"+city,openWeather);
        ResponseEntity<OpenWeather> response = new ResponseEntity<>(openWeather, HttpStatusCode.valueOf(200));
        return response;
    }

    @GetMapping("/forecast")
    public ResponseEntity<Forecast> getForecast(@RequestParam("lat") String lat, @RequestParam("lon") String lon){
        Forecast forecast = (Forecast) redisTemplate.opsForHash().get("forecast","forecast"+lat+"_"+lon);
        if(forecast != null){
            return new ResponseEntity<>(forecast,HttpStatusCode.valueOf(200));
        }
        forecast = weatherService.getForecast(lat,lon);
        redisTemplate.opsForHash().put("forecast","forecast"+lat+"_"+lon,forecast);
        ResponseEntity<Forecast> response = new ResponseEntity<>(forecast, HttpStatusCode.valueOf(200));
        return response;
    }
}
