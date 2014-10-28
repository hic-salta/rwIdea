package by.bsu.rw.logicactions;

import by.bsu.rw.train.Train;
import by.bsu.rw.vehicle.AbstractVehicle;
import org.apache.log4j.Logger;
import java.util.ArrayList;

public final class SearchByPassngCount {
	final static Logger LOG = Logger.getLogger(SearchByPassngCount.class);

	public static ArrayList<AbstractVehicle> findACar(Train train,
			double minPassCount, double maxPassCount) {
		ArrayList<AbstractVehicle> resultList = new ArrayList<AbstractVehicle>();
		for (AbstractVehicle vehicle : train.getListOfVehicles()) {
			if (vehicle.getNumberOfPassengers() >= minPassCount
					&& vehicle.getNumberOfPassengers() <= maxPassCount) {
				resultList.add(vehicle);
			}
		}
		if (resultList.isEmpty()) {
			LOG.info("Nothing found");
		} else {
			LOG.info("Found:");
		}
		return (ArrayList<AbstractVehicle>) resultList.clone();
	}
}
