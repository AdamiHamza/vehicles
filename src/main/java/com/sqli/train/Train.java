package com.sqli.train;

import java.util.ArrayList;
import java.util.List;

/**
 * Train.
 *
 * @author Adami Hamza
 */
public class Train {
	//Empty train
	private ITrain emptyTrain = new EmptyTrain();
	//List of train parts
	private List<ITrain> trainParts = null;

	/**
	 * Construct All train parts.
	 * @param train train parts in string representation.
	 */
	public Train(final String train) {
		emptyTrain = new EmptyTrain();
		trainParts = new ArrayList<ITrain>();
		ITrain lastPart = null;
		for (int i = 0; i < train.length(); i++) {
			if (i != 0) {
				lastPart = trainParts.get(trainParts.size() - 1);
				trainParts.add(new ConnectorDecorator(lastPart));
				lastPart = trainParts.get(trainParts.size() - 1);
			}
			if (train.charAt(i) == 'P' && i != 0) {
				trainParts.add(new PassengerDecorator(lastPart));
			}
			if (train.charAt(i) == 'R' && i != 0) {
				trainParts.add(new RestaurantDecorator(lastPart));
			}
			if (train.charAt(i) == 'H' && i == 0) {
				trainParts.add(new FirstWagonDecorator(emptyTrain));
			}
			if (train.charAt(i) == 'H' && i == train.length() - 1) {
				trainParts.add(new LastWagonDecorator(lastPart));
			}
			if (train.charAt(i) == 'C' && i != 0) {
				trainParts.add(new CargoDecorator(lastPart, new EmptyCargo()));
			}
			if (train.charAt(i) == 'F' && i != 0) {
				trainParts.add(new CargoDecorator(lastPart, new LoadedCargo()));
			}
		}
	}


	/**
	 * @return Train representation.
	 */
	public String print() {
		return trainParts.get(trainParts.size() - 1).print();
	}

	/**
	 * Fill the first empty cargo.
	 * @return if any empty cargo found, return true else return false.
	 */
	public boolean fill() {
		for (ITrain train : trainParts) {
			if (train instanceof CargoDecorator) {
				CargoDecorator cargoDecorator = ((CargoDecorator) train);
				if (cargoDecorator.getCargoState() instanceof EmptyCargo) {
					cargoDecorator.fill();
					return true;
				}
			}
		}
		return false;
	}


	/**
	 * Detach the last cargo (Teal Cargo).
	 */
	public void detachEnd() {
		trainParts.remove(trainParts.size() - 1);
		trainParts.remove(trainParts.size() - 1);
	}

	/**
	 * Detach the first cargo (Head Cargo).
	 */
	public void detachHead() {
		trainParts.remove(0);
		trainParts.remove(0);
		trainParts.get(0).reAttach(emptyTrain);
	}
}

