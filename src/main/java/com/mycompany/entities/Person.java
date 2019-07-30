package com.mycompany.entities;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

@Builder
@Getter
public class Person {

    @Singular
    private final List<String> langueageDetails;

}
