package com.mycompany.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale.Category;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Car {

    private final String     make;
    private final Model      model;
    private final int        numberOfSeats;
    private final LocalDate  manufactoringDate;
    private final BigDecimal price;
    private final Category   category;
}
