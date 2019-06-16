package com.mycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.mycompany.entities.CarDto;
import com.mycompany.service.Car;
import com.mycompany.service.Model;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "jsr330")
public interface CarMapper {

    @Mapping(target = "seatCount", source = "numberOfSeats") // different property mapper
    @Mapping(target = "manufactoringDate", dateFormat = "yyyy-MM-dd") // Date formatter mapping
    @Mapping(target = "model", source = "model.name") // Nested mapping
    CarDto toDto(Car car);

    // We define the our own mapping instead of nested mapping
    default String map(final Model model) {
        if (model == null) {
            return null;
        }
        return model.getName();
    }
}
