package com.mycompany.entities;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Builder
public class Customer {

    @Getter(lazy = true)
    private final List<String> langueageDetails = new ArrayList<>();

}
