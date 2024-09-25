package dev.shubham.openweather.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Daily {
    private long dt;
    private long sunrise;
    private long sunset;
    private TempDto temp;
    private FeelsLikeDto feels_like;
    private int pressure;
    private int humidity;
    private List<WeatherDto> weather;
    private double speed;
    private int deg;
    private double gust;
    private int clouds;
    private double pop;
    private double rain;
}
