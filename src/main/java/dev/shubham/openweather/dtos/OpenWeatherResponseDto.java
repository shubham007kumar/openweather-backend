package dev.shubham.openweather.dtos;

import dev.shubham.openweather.models.OpenWeather;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OpenWeatherResponseDto {
    private CoordDto coord;
    private List<WeatherDto> weather;
    private String base;
    private MainDto main;
    private int visibility;
    private WindDto wind;

    private RainDto rain;
    private CloudDto clouds;
    private long dt;
    private SysDto sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;
}
