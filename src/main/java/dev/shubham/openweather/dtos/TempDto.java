package dev.shubham.openweather.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TempDto {
    private double day;
    private double min;
    private double max;
    private double night;
    private double eve;
    private double morn;
}
