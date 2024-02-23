package edu.mu;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		VehicleManager vehicleManager = new VehicleManager();
		boolean readFile = vehicleManager.readFromFile("vehicleList.csv");
		System.out.println("\n-------------Original Car Info-------------");
		vehicleManager.displayAllVehicleInformation();
    
		System.out.println("\n-------------Individual Car Info of Test-------------");
		Car carTest = new Car("Test", "Test", 2024, 100000, VehicleColor.BLUE, FuelType.DIESEL, 50000, 3.0, 4, 20, StartMechanism.KEYSTART);
		boolean add = vehicleManager.addVehicle(carTest);
		vehicleManager.displayVehicleInformation(carTest);

		System.out.println("\n-------------Car Info with Test-------------");
		vehicleManager.displayAllVehicleInformation();
		
		boolean remove = vehicleManager.removeVehicle(carTest);
		System.out.println("\n-------------Car Info without Test-------------");
		vehicleManager.displayAllVehicleInformation();
		
		boolean save = vehicleManager.saveVehicleList();
		System.out.println("\n-------------Reading info in after save to CSV-------------");
		vehicleManager.readFromFile("vehicleList.csv");
		vehicleManager.displayAllVehicleInformation();

		System.out.println("\n-------------All Truck info-------------");
		vehicleManager.displayAllTruckInformation();
		
		System.out.println("\n-------------All SUV info-------------");
		vehicleManager.displayAllSUVInformation();
		
		System.out.println("\n-------------All MotorBike info-------------");
		vehicleManager.displayAllMotorBikeInformation();
		
		System.out.println("\n-------------All vehicle info-------------");
		vehicleManager.displayAllVehicleInformation();
		
		Vehicle highestMaintenanceCostVehicle = vehicleManager.getVehicleWithHighestMaintenanceCost(100);
		System.out.println("\n-------------Highest Maintenance Cost Vehicle-------------");
		System.out.println(highestMaintenanceCostVehicle);
		Vehicle lowestMaintenanceCostVehicle =vehicleManager.getVehicleWithLowestMaintenanceCost(100);
		System.out.println("\n-------------Lowest Maintenance Cost Vehicle-------------");
		System.out.println(lowestMaintenanceCostVehicle);
		ArrayList<Vehicle> highestFuelEfficiencyVehicles = vehicleManager.getVehicleWithHighestFuelEfficiency(100, 100);
		System.out.println("\n-------------Highest Fuel Efficiency Vehicle-------------");
		System.out.println(highestFuelEfficiencyVehicles);
		ArrayList<Vehicle> lowestFuelEfficiencyVehicles = vehicleManager.getVehicleWithLowestFuelEfficiency(100, 100);
		System.out.println("\n-------------Lowest Fuel Efficiency Vehicle-------------");
		System.out.println(lowestFuelEfficiencyVehicles);
		double averageFuelEfficiencyOfSUVs = vehicleManager.getAverageFuelEfficiencyOfSUVs(100, 100);
		System.out.println("\n-------------Average Fuel Efficiency Of SUVs-------------");
		System.out.println(averageFuelEfficiencyOfSUVs);

	}

}
