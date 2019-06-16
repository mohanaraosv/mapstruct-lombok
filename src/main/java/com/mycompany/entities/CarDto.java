package com.mycompany.entities;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CarDto {

    private final String make;
    private final String model;
    private final int    seatCount;
    private final String manufactoringDate;
    private final double price;
    private final String category;
}
