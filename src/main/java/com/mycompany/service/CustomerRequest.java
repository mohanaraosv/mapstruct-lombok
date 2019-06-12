package com.mycompany.service;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CustomerRequest {

    private final String firstName;
    private final String lastName;
    private final int    customerId;

}
