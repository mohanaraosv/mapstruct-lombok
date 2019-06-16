package com.mycompany.service;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Garage {

    private final String    id;
    private final String    name;
    private final List<Car> cars;

}
