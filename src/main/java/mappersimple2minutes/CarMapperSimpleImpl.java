package mappersimple2minutes;

import mapper2minutes.Car;
import mapper2minutes.CarDto;

public class CarMapperSimpleImpl implements CarMapperSimple {

	CarMapperSimple INSTANCE = new CarMapperSimpleImpl();

	@Override
	public CarDto carToCarDto(Car car) {
		return new CarDto(car.getMake(), car.getNumberOfSeats(), car.getType().toString());
	}

}
