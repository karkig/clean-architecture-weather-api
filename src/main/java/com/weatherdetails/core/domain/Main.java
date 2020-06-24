package com.weatherdetails.core.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Main {
    public Double temp;
    public Double pressure;
    public Integer humidity;
    public Double tempMin;
    public Double tempMax;
    public Double seaLevel;
    public Double grndLevel;

}