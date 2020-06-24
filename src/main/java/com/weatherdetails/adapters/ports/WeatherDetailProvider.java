package com.weatherdetails.adapters.ports;

import com.weatherdetails.core.domain.WeatherDetails;

public interface WeatherDetailProvider {
    WeatherDetails provideDetail(String lat, String lon);
}
