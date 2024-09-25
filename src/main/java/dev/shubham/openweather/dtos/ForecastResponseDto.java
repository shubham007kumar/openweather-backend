package dev.shubham.openweather.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ForecastResponseDto {
    private int cnt;
    private String cod;
    private double message;
    private City city;
    private List<Daily> list;
}
