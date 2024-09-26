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
public class Daily implements Serializable {
    private long dt;
    private Temp temp;
    private List<Weather> weather;
}
