package com.mycompany.entities;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class GarageDto {

    private final String       id;
    private final String       name;
    private final List<CarDto> cars;

}
