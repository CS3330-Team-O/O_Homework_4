package edu.mu;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		VehicleManager vehicleManager = new VehicleManager();
		boolean readFile = vehicleManager.readFromFile("vehicleList.csv");
		System.out.println("-------------Original Car Info-------------\n");
		vehicleManager.displayAllCarInformation();
    
		Car carTest = new Car("Test", "Test", 2024, 100000, VehicleColor.BLUE, FuelType.DIESEL, 50000, 3.0, 4, 20, StartMechanism.KEYSTART);
		boolean add = vehicleManager.addVehicle(carTest);

		System.out.println("-------------Car Info with Test-------------\n");
		vehicleManager.displayAllCarInformation();
		
		boolean remove = vehicleManager.removeVehicle(carTest);
		System.out.println("-------------Car Info without Test-------------\n");
		vehicleManager.displayAllCarInformation();
		
		boolean save = vehicleManager.saveVehicleList();
		System.out.println("-------------Reading info in after save to CSV-------------\n");
		vehicleManager.readFromFile("vehicleList.csv");
		vehicleManager.displayAllCarInformation();

		vehicleManager.displayAllTruckInformation();
		vehicleManager.displayAllSUVInformation();
		vehicleManager.displayAllMotorBikeInformation();
		vehicleManager.displayAllVehicleInformation();
		
		Vehicle highestMaintenanceCostVehicle = vehicleManager.getVehicleWithHighestMaintenanceCost(100);
		System.out.println("highestMaintenanceCostVehicle: " + highestMaintenanceCostVehicle);
		Vehicle lowestMaintenanceCostVehicle =vehicleManager.getVehicleWithLowestMaintenanceCost(100);
		System.out.println("lowestMaintenanceCostVehicle: " + lowestMaintenanceCostVehicle);
		ArrayList<Vehicle> highestFuelEfficiencyVehicles = vehicleManager.getVehicleWithHighestFuelEfficiency(100, 100);
		System.out.println("highestFuelEfficiencyVehicle: " + highestFuelEfficiencyVehicles);
		ArrayList<Vehicle> lowestFuelEfficiencyVehicles = vehicleManager.getVehicleWithLowestFuelEfficiency(100, 100);
		System.out.println("lowestFuelEfficiencyVehicle: " + lowestFuelEfficiencyVehicles);
		double averageFuelEfficiencyOfSUVs = vehicleManager.getAverageFuelEfficiencyOfSUVs(100, 100);
		System.out.println("averageFuelEfficiencyOfSUVs: " + averageFuelEfficiencyOfSUVs);

	}

}
