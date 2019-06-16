package com.mycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.mycompany.entities.CustomerInput;
import com.mycompany.service.CustomerRequest;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface CustomerTargetMapper {

    CustomerInput toCustomer(CustomerRequest customer);
}
