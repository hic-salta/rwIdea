package by.bsu.rw.vehicle;

import java.text.MessageFormat;

public class CargoCar extends AbstractVehicle {
	private double cargoCapacity;
	
	public CargoCar(int id, double weight, String model, double cargoCapacity) {
		super(id, weight, model);
		this.cargoCapacity = cargoCapacity;
	}
	
	public double getCargoCapacity() {
		return cargoCapacity;
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
    public String toString(){
        return MessageFormat.format("{0}. Cargo capacity: {1}", super.toString(), this.cargoCapacity);
    }

}
