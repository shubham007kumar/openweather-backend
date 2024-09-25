package dev.shubham.openweather.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class City {
    private CoordDto coord;
    private String country;
    private long id;
    private String name;
    private long population;
    private long timezone;
}
