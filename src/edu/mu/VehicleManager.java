package edu.mu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class VehicleManager {
	String vehicleFilePath = "vehicleList.csv";
	ArrayList <Vehicle> vehicleList;

	//Ash
	public boolean readFromFile(String fileName) {
		String line = "";  
		String split = ",";  
		try {
			BufferedReader br = new BufferedReader(new FileReader(vehicleFilePath));  
			while ((line = br.readLine()) != null) {  
			String[] v = line.split(split); 
			String type = v[0];
			String model = v[1];
			String make = v[2];
			long modelYear = Long.parseLong(v[3]);
			double price = Double.parseDouble(v[4]);
			VehicleColor color = Vehicle.convertStringToVehicleColor(v[5]);
			FuelType fuelType = Vehicle.convertStringToFuelType(v[6]);
			double mileage = Double.parseDouble(v[7]);
			double mass = Double.parseDouble(v[8]);
			int cylinders = Integer.parseInt(v[9]);
			double gasTank = Double.parseDouble(v[10]);
			StartMechanism startType = Vehicle.convertStringToStartMechanism(v[11]);
			//Vehicle vehicle = new Vehicle(type, model, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTank, startType);
			}  
			return true;
		} catch (IOException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
			return false;
		}
	}
	
	//Ash
	public void VehicleManager(String fileName) {
			
	}
	
	//Syd
	public void displayAllCarInformation() {
		
	}
	
	//Syd
	public void displayAllTruckInformation() {
		
	}
	
	//Syd
	public void displayAllSUVInformation() {
		
	}
	
	//Syd
	public void displayAllMotorBikeInformation() {
		
	}
	
	//Syd
	public void displayVehicleInformation(Vehicle v) {
		
	}
	
	//Syd
	public void displayAllVehicleInformation() {
		
	}
	
	//Ash
	public boolean removeVehicle(Vehicle vehicle) {
		return true;
	}
	
	//Ash
	public boolean addVehicle(Vehicle vehicle) {
		return true;
	}
	
	//Ash
	public boolean saveVehicleList() {
		return true;
	}
	
	//Isaiah
		private <T> boolean isVehicleType(Vehicle v, Class<T> clazz) {
			
			return (v.getClass() == clazz);
		}
		
	//Isaiah
	public int getNumberOfVehichlesByType(@SuppressWarnings("rawtypes") Class clazz) {
			
		int count = 0;
		for(int i = 0; i < vehicleList.size(); ++i) {
			if(vehicleList.get(i).getClass() == clazz) {
					count++;
			}
		}
		return count;
	}
	
	//David
	public Vehicle getVehicleWithHighestMaintenanceCost(double distance) {
		
	}
	
	//David
	public Vehicle getVehicleWithLowestMaintenanceCost(double distance) {
		
	}
	
	//David
	public ArrayList<Vehicle> getVehicleWithHighestFuelEfficiency(double distance, double fuelPrice) {
		
	}
	
	//David
	public ArrayList<Vehicle> getVehicleWithLowestFuelEfficiency(double distance, double fuelPrice) {
		
	}
	
	//David
	public double getAverageFuelEfficiencyOfSUVs(double distance, double fuelPrice) {
		
	}
	
}
