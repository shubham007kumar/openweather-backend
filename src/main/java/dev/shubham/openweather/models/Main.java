package dev.shubham.openweather.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Main implements Serializable {
    private double temp;
    private double feels_like;
    private int pressure;
    private int humidity;
}
