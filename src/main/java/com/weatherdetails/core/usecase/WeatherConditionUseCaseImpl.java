package com.weatherdetails.core.usecase;

import com.weatherdetails.core.config.Constants;
import com.weatherdetails.core.domain.WeatherDetails;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class WeatherConditionUseCaseImpl implements WeatherConditionUseCase {

    @Autowired
    RestTemplate restTemplate;

    public WeatherDetails provideWeatherDetails(String lat, String lon) {
        WeatherDetails weatherDetails = restTemplate.getForObject(Constants.BASE_URL + "lat=" + lat + "&lon=" + lon + "&appid=" + Constants.API_KEY
                , WeatherDetails.class);
        return weatherDetails;
    }

}
