package dev.shubham.openweather.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Main {
    private double temp;
    private double feels_like;
    private int pressure;
    private int humidity;
}
