package com.weatherdetails.web.controller;

import com.weatherdetails.adapters.WeatherDetailsAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
@ComponentScan("com.core")
public class WeatherController {
    @Autowired
    WeatherDetailsAdapter weatherAdapter;

    @GetMapping(value = "/details")
    public ResponseEntity getWeatherReport(@RequestParam(value = "lat") String lat, @RequestParam(value = "lon") String lon) {
        System.out.println();
        return new ResponseEntity<>(weatherAdapter.provideDetail(lat, lon), HttpStatus.OK);

    }
}
