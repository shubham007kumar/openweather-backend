package dev.shubham.openweather.exceptions;

public class CityNotFoundException extends Exception{

    public CityNotFoundException(String message){
        super(message);
    }
}
