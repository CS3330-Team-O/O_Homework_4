package edu.mu;

public class Main {

	public static void main(String[] args) {
		VehicleManager vehicleManager = new VehicleManager();
		boolean readFile = vehicleManager.readFromFile("vehicleList.csv");
		vehicleManager.getVehicleWithHighestMaintenanceCost(0);
		vehicleManager.getVehicleWithLowestMaintenanceCost(0);
		vehicleManager.getVehicleWithHighestFuelEfficiency(0, 0);
		vehicleManager.getVehicleWithLowestFuelEfficiency(0, 0);
		vehicleManager.getAverageFuelEfficiencyOfSUVs(0, 0);
	}

}
