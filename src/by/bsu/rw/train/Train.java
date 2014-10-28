package by.bsu.rw.train;

import by.bsu.rw.vehicle.AbstractVehicle;
import by.bsu.rw.vehicle.PassengerCar;
import by.bsu.rw.vehicle.CargoCar;
import java.util.ArrayList;

public class Train {
	private int id;
	private String trainName;
	private int totalNumberOfCars = 0;
	private int totalNumberOfPassengers = 0;
	private int totalCargoCapacity = 0;
	private ArrayList<AbstractVehicle> listOfVehicles = new ArrayList<AbstractVehicle>();

	public Train(String trainName) {
		this.id = 100 + (int) (Math.random() * 900);
		this.trainName = trainName;
	}

	public void addVehicles(ArrayList<AbstractVehicle> vehicles) {
		for (AbstractVehicle vehicle : vehicles) {
			if (vehicle instanceof PassengerCar) {
				totalNumberOfPassengers += ((PassengerCar) vehicle)
						.getNumberOfPassengers();
			} else if (vehicle instanceof CargoCar) {
				totalCargoCapacity += ((CargoCar) vehicle).getCargoCapacity();
			} else {
				throw new IllegalArgumentException("Wrong type of car.");
			}
			listOfVehicles.add(vehicle);
		}
	}

	public int getId() {
		return id;
	}

	public String getTrainName() {
		return trainName;
	}

	public int getTotalNumberOfPassengers() {
		return totalNumberOfPassengers;
	}

	public int getTotalCargoCapacity() {
		return totalCargoCapacity;
	}

	public ArrayList<AbstractVehicle> getListOfVehicles() {
		ArrayList<AbstractVehicle> clone = (ArrayList<AbstractVehicle>) listOfVehicles.clone();
		return clone;
	}
}
