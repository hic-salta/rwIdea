package by.bsu.rw.logicactions;

import java.util.Comparator;
import by.bsu.rw.vehicle.AbstractVehicle;

public class ComfComparator implements Comparator<AbstractVehicle> {

	public int compare(AbstractVehicle firstCar, AbstractVehicle secondCar) {
		Double firstCarComf = (double) firstCar.getComfortLevel();
		Double secondCarComf = (double) secondCar.getComfortLevel();
		return firstCarComf.compareTo(secondCarComf);
	}

}
