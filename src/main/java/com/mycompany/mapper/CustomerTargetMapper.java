package com.mycompany.mapper;

import org.mapstruct.Mapper;

import com.mycompany.entities.CustomerInput;
import com.mycompany.service.CustomerRequest;

@Mapper
public interface CustomerTargetMapper {

    CustomerInput toCustomer(CustomerRequest customer);
}
