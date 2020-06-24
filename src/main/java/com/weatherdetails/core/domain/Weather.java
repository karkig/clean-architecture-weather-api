package com.weatherdetails.core.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Weather {

    public Integer id;
    public String main;
    public String description;
    public String icon;

}
