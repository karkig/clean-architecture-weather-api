package com.weatherdetails.core.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Sys{
    public Double message;
    public String country;
    public Integer sunrise;
    public Integer sunset;
}