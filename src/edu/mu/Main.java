package edu.mu;

public class Main {

	public static void main(String[] args) {
		VehicleManager vehicleManager = new VehicleManager();
		boolean readFile = vehicleManager.readFromFile("vehicleList.csv");
		vehicleManager.VehicleManager("vehicleList.csv");
		boolean remove = vehicleManager.removeVehicle(null);
		boolean add = vehicleManager.addVehicle(null);
		boolean save = vehicleManager.saveVehicleList();
	}

}
