package by.bsu.rw.vehicle;

import java.text.MessageFormat;

public abstract class AbstractVehicle {
	private int id;
	private double weight;
	private String model;

	public AbstractVehicle(int id, double weight, String model) {
		this.id = id;
		this.weight = weight;
		this.model = model;
	}

	public int getId() {
		return id;
	}

	public double getWeight() {
		return weight;
	}

	public String getModel() {
		return model;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public abstract int getComfortLevel();

	public abstract int getNumberOfPassengers();

	@Override
	public String toString() {
		return MessageFormat.format("ID: {0}. Weight: {1}. Model: {2}. ",
				this.id, this.weight, this.model);
	}
}
