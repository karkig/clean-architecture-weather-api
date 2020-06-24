package com.weatherdetails.adapters;

import com.weatherdetails.adapters.ports.WeatherDetailProvider;
import com.weatherdetails.core.domain.WeatherDetails;
import com.weatherdetails.core.usecase.WeatherConditionUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherDetailsAdapter implements WeatherDetailProvider {
    @Autowired
    WeatherConditionUseCase useCase;

    @Override
    public WeatherDetails provideDetail(String lat, String lon) {
      return useCase.provideWeatherDetails(lat,lon);
    }
}
