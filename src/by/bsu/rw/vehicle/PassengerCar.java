package by.bsu.rw.vehicle;

import java.text.MessageFormat;

public class PassengerCar extends AbstractVehicle {

	private int numberOfPassengers;
	private int comfortLevel;

	public PassengerCar(int id, double weight, String model,
			int numberOfPassengers, int comfortLevel) {
		super(id, weight, model);
		this.numberOfPassengers = numberOfPassengers;
		this.comfortLevel = comfortLevel;
	}

	@Override
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	@Override
	public int getComfortLevel() {
		return comfortLevel;
	}

	@Override
	public String toString() {
		return MessageFormat
				.format("{0}. Number of passengers: {1}. Passenger car comfort level: {2}",
						super.toString(), this.getNumberOfPassengers());
	}

}
