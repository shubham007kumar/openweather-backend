package dev.shubham.openweather.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WindDto {
    private double speed;
    private double deg;
    private double gust;
}
