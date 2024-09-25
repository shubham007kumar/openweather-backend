package dev.shubham.openweather.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SysDto {
    private int type;
    private int id;
    private String country;
    private long sunrise;
    private long sunset;
}
