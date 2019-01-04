package uk.co.kleindelao.demo.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import uk.co.kleindelao.demo.pojos.Car;
import uk.co.kleindelao.demo.pojos.CarDto;

@Mapper
public interface CarMapper {
    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToCarDto(Car car);

    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto updateFromCar(Car car, @MappingTarget CarDto dto);
}
