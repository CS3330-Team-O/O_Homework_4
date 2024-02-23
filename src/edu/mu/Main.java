package edu.mu;

public class Main {

	public static void main(String[] args) {
		VehicleManager vehicleManager = new VehicleManager();
		boolean readFile = vehicleManager.readFromFile("vehicleList.csv");
		vehicleManager.VehicleManager("vehicleList.csv");
		Car carTest = new Car("Test", "Test", 2024, 100000, VehicleColor.BLUE, FuelType.DIESEL, 50000, 3.0, 4, 20, StartMechanism.KEYSTART);
		boolean add = vehicleManager.addVehicle(carTest);
		boolean remove = vehicleManager.removeVehicle(carTest);
		boolean save = vehicleManager.saveVehicleList();
		
		vehicleManager.displayAllCarInformation();
		vehicleManager.displayAllTruckInformation();
		vehicleManager.displayAllSUVInformation();
		vehicleManager.displayAllMotorBikeInformation();
		vehicleManager.displayAllVehicleInformation();
		vehicleManager.displayVehicleInformation(carTest);
		
		vehicleManager.getVehicleWithHighestMaintenanceCost(0);
		vehicleManager.getVehicleWithLowestMaintenanceCost(0);
		vehicleManager.getVehicleWithHighestFuelEfficiency(0, 0);
		vehicleManager.getVehicleWithLowestFuelEfficiency(0, 0);
		vehicleManager.getAverageFuelEfficiencyOfSUVs(0, 0);
	}

}
