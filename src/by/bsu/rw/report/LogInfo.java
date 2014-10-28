package by.bsu.rw.report;

import by.bsu.rw.train.Train;
import by.bsu.rw.logicactions.ComfComparator;
import by.bsu.rw.vehicle.AbstractVehicle;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.Collections;

public class LogInfo {
	final static Logger LOG = Logger.getLogger(LogInfo.class);

	public static void getInfo(ArrayList<AbstractVehicle> listOfVehicles)
			throws IllegalArgumentException {
		for (AbstractVehicle vehicle : listOfVehicles) {
			if (vehicle != null) {
				LOG.info(vehicle);
			} else {
				throw new IllegalArgumentException("List of car is empty.");
			}
		}
	}

	public static void logSortedCars(Train train) {
		Collections.sort(train.getListOfVehicles(), new ComfComparator());
		LOG.info("Sorted list of cars");
		getInfo(train.getListOfVehicles());
	}

	public static void logTotalCargoCapacity(Train train) {
		LOG.info("Total cargo capacity: " + train.getTotalCargoCapacity());
	}

	public static void logTotalNumberOfPassengers(Train train) {
		LOG.info("Total number of passengers: "
				+ train.getTotalNumberOfPassengers());
	}
}
