package by.bsu.rw.creator;

import by.bsu.rw.train.Train;
import by.bsu.rw.vehicle.CargoCar;
import by.bsu.rw.vehicle.Locomotive;
import by.bsu.rw.vehicle.PassengerCar;

public final class Creator {

	public static PassengerCar createPassengerCar(int id, double weight,
			String model, int numberOfPassengers, int comfortLevel)
			throws IllegalArgumentException {
		PassengerCar vehicle = new PassengerCar(id, weight, model,
				numberOfPassengers, comfortLevel);
		return vehicle;
	}

	public static CargoCar createCargoCar(int id, double weight, String model,
			double cargoCapacity) throws IllegalArgumentException {
		CargoCar vehicle = new CargoCar(id, weight, model, cargoCapacity);
		vehicle.setWeight(vehicle.getWeight() + vehicle.getCargoCapacity());
		return vehicle;
	}

	public static Locomotive createLocomotive(int id, double weight,
			String model, double power, double range, int speed)
			throws IllegalArgumentException {
		Locomotive vehicle = new Locomotive(id, weight, model, power, range,
				speed);
		return vehicle;
	}

	public static Train createTrain(String trainName)
			throws IllegalArgumentException {
		return new Train(trainName);
	}
}
