package com.weatherdetails.core.usecase;


import com.weatherdetails.core.domain.WeatherDetails;

public interface WeatherConditionUseCase {
    public WeatherDetails provideWeatherDetails(String lat, String lon);
}
