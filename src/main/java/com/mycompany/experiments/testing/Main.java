package com.mycompany.experiments.testing;

import org.mapstruct.factory.Mappers;

import com.mycompany.entities.CustomerInput;
import com.mycompany.mapper.CustomerTargetMapper;
import com.mycompany.service.CustomerRequest;

public class Main {

    public static void main(final String[] args) {
        CustomerRequest customer = CustomerRequest.builder()
                .firstName("Mohana Rao")
                .lastName("Rao")
                .customerId(420)
                .build();

        CustomerTargetMapper customerTargetMapper = Mappers.getMapper(CustomerTargetMapper.class);
        CustomerInput cusTarget = customerTargetMapper.toCustomer(customer);
        System.out.println(cusTarget);
    }
}
