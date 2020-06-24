package com.weatherdetails.core.usecase;

import com.weatherdetails.core.domain.WeatherDetails;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class WeatherConditionUseCaseImplTest {
    @Mock
    RestTemplate restTemplate;

    WeatherConditionUseCase weatherConditionUseCase;
    WeatherDetails user;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        weatherConditionUseCase = new WeatherConditionUseCaseImpl(restTemplate);
        user = new WeatherDetails();
        user.setId(10);
        user.setName("India");
    }

    @Test
    public void provideWeatherDetails_Success() throws Exception {

        when(restTemplate.getForObject(anyString(), eq(WeatherDetails.class))).thenReturn(user);
        WeatherDetails weatherDetails = weatherConditionUseCase.provideWeatherDetails("10", "20");
        assertThat(weatherDetails.getName()).isEqualTo("India");
        assertThat(weatherDetails.getId()).isEqualTo(10);

    }
}
