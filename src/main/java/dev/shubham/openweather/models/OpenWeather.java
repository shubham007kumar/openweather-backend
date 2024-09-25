package dev.shubham.openweather.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OpenWeather {
    private Main main;
    private Clouds clouds;
    private Wind wind;
    private List<Weather> weather;
    private int visibility;
}
