package edu.mu;

public class Main {

	public static void main(String[] args) {
		VehicleManager vehicleManager = new VehicleManager();
		boolean readFile = vehicleManager.readFromFile("vehicleList.csv");
		System.out.println("-------------Original Car Info-------------\n");
		vehicleManager.displayAllCarInformation();
		
		Car carTest = new Car("Test", "Test", 2024, 100000, VehicleColor.BLUE, FuelType.DIESEL, 50000, 3.0, 4, 20, StartMechanism.KEYSTART);
		boolean add = vehicleManager.addVehicle(carTest);
<<<<<<< HEAD
		vehicleManager.displayVehicleInformation(carTest);
		boolean remove = vehicleManager.removeVehicle(carTest);
		boolean save = vehicleManager.saveVehicleList();
		
		
		
=======
		System.out.println("-------------Car Info with Test-------------\n");
>>>>>>> 6244d68b804414a9e42b94eb6084cd98e8c2cbb2
		vehicleManager.displayAllCarInformation();
		
		boolean remove = vehicleManager.removeVehicle(carTest);
		System.out.println("-------------Car Info without Test-------------\n");
		vehicleManager.displayAllCarInformation();
		
		boolean save = vehicleManager.saveVehicleList();
		System.out.println("-------------Reading info in after save to CSV-------------\n");
		vehicleManager.VehicleManager("vehicleList.csv");
		vehicleManager.displayAllCarInformation();

		vehicleManager.displayAllTruckInformation();
		vehicleManager.displayAllSUVInformation();
		vehicleManager.displayAllMotorBikeInformation();
		vehicleManager.displayAllVehicleInformation();
		
		vehicleManager.getVehicleWithHighestMaintenanceCost(0);
		vehicleManager.getVehicleWithLowestMaintenanceCost(0);
		vehicleManager.getVehicleWithHighestFuelEfficiency(0, 0);
		vehicleManager.getVehicleWithLowestFuelEfficiency(0, 0);
		vehicleManager.getAverageFuelEfficiencyOfSUVs(0, 0);
	}

}
