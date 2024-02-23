package edu.mu;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		VehicleManager vehicleManager = new VehicleManager("vehicleList.csv");
		Car carTest = new Car("Test", "Test", 2024, 100000, VehicleColor.BLUE, FuelType.DIESEL, 50000, 3.0, 4, 20, StartMechanism.KEYSTART);
		boolean add = vehicleManager.addVehicle(carTest);
		boolean remove = vehicleManager.removeVehicle(carTest);
		vehicleManager.displayAllCarInformation();
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
		
		boolean save = vehicleManager.saveVehicleList();
	}

}
