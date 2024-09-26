package dev.shubham.openweather.advices;

import dev.shubham.openweather.dtos.ErrorDto;
import dev.shubham.openweather.exceptions.CityNotFoundException;
import dev.shubham.openweather.exceptions.ForeCastException;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(CityNotFoundException.class)
    public ResponseEntity<ErrorDto> handleCityNotFoundException(CityNotFoundException exception){
        ErrorDto errorDto = new ErrorDto();
        errorDto.setMessage(exception.getMessage());
        return new ResponseEntity<>(errorDto, HttpStatusCode.valueOf(404));
    }

    @ExceptionHandler(ForeCastException.class)
    public ResponseEntity<ErrorDto> handleCityNotFoundException(ForeCastException exception){
        ErrorDto errorDto = new ErrorDto();
        errorDto.setMessage(exception.getMessage());
        return new ResponseEntity<>(errorDto, HttpStatusCode.valueOf(404));
    }
}
