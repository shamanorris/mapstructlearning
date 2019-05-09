package mappersimple2minutes;

import mapper2minutes.Car;
import mapper2minutes.CarDto;

public interface CarMapperSimple {

	// CarMapperSimple INSTANCE = new CarMapperSimple();

	CarDto carToCarDto(Car car);
}