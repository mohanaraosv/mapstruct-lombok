package com.mycompany.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.mycompany.entities.GarageDto;
import com.mycompany.service.Garage;

@Mapper(uses = CarMapper.class, componentModel = "jsr330", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface GarageMapper {

    GarageDto map(Garage garage);
}
