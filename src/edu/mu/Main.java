package edu.mu;

public class Main {

	public static void main(String[] args) {
		VehicleManager vehicleManager = new VehicleManager();
		boolean readFile = VehicleManager.readFromFile("vehicleList.csv");
	}

}
