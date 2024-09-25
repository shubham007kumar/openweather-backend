package dev.shubham.openweather.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OpenWeather implements Serializable {
    private Main main;
    private Clouds clouds;
    private Wind wind;
    private Sys sys;
    private Coord coord;
    private List<Weather> weather;
    private int visibility;
}
