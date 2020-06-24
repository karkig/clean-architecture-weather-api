package com.weatherdetails.core.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class WeatherDetails {

    public Coord coord;
    public List<Weather> weather = null;
    public String base;
    public Main main;
    public Wind wind;
    public Clouds clouds;
    public Integer dt;
    public Sys sys;
    public Integer id;
    public String name;
    public Integer cod;

}