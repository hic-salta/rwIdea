package by.bsu.rw.vehicle;

import java.text.MessageFormat;

public class Locomotive extends AbstractVehicle {
	private double power;
	private double range;
	private int speed;

	public Locomotive(int id, double weight, String model, double power,
			double range, int speed) {
		super(id, weight, model);
		this.power = power;
		this.range = range;
		this.speed = speed;
	}

	public double getPower() {
		return power;
	}

	public double getRange() {
		return range;
	}

	public double getSpeed() {
		return speed;
	}

	@Override
	public int getComfortLevel() {
		return 0;
	}

	@Override
	public int getNumberOfPassengers() {
		return 0;
	}

	@Override
	public String toString() {
		return MessageFormat
				.format("{0}. Locomotive's power: {1}. Locomotive's range: {2}. Locomotive's speed: {3}",
						super.toString(), this.power, this.range, this.speed);
	}

}
