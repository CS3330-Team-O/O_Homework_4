package edu.mu;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class VehicleManager {
	String vehicleFilePath = "./vehicleList.csv";
	public ArrayList <Vehicle> vehicleList = new ArrayList<>();
	private final static double distance = 300;
	private final static double fuelPrice = 3.25;

	//Ash
	public boolean readFromFile(String fileName) {
		String line = "";
		String split = ",";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			br.readLine();
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
			switch (type) {
				case "Car":
					Vehicle car = new Car(model, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTank, startType);
					this.vehicleList.add(car);
				case "Truck":
					Vehicle truck = new Truck(model, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTank, startType);
					this.vehicleList.add(truck);
				case "SUV":
					Vehicle suv = new SUV(model, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTank, startType);
					this.vehicleList.add(suv);
				case "MotorBike":
					Vehicle motorBike = new MotorBike(model, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTank, startType);
					this.vehicleList.add(motorBike);
			}
			}
			br.close();
			return true;
		} catch (IOException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
			return false;
		}
	}

	//Ash
	public VehicleManager(String fileName) {
		readFromFile(fileName);
	}
	
	public VehicleManager() {
		
	}

	//Syd
	public void displayAllCarInformation() {
		boolean cars = false;
		for(int i = 0; i < vehicleList.size(); i++){
				if(vehicleList.get(i) instanceof Car) {
					cars=true;
					System.out.println(vehicleList.get(i).toString());
					System.out.println("Maintenance Cost: " + vehicleList.get(i).calculateMaintenanceCost(distance) + ", Fuel Efficiency:" + vehicleList.get(i).calculateFuelEfficiency(distance, fuelPrice) + ", Start Engine:" + vehicleList.get(i).getStartType());
				}
			}
		if(!cars) {
			System.out.println("There are no cars in this list!");
		}
	}

	//Syd
	public void displayAllTruckInformation() {
		boolean trucks = false;
		for(int i = 0; i < vehicleList.size(); i++){
			if(vehicleList.get(i) instanceof Truck) {
				trucks=true;
				System.out.println(vehicleList.get(i).toString()+",Maintenance Cost: " +vehicleList.get(i).calculateMaintenanceCost(distance) + ", Fuel Efficiency:" + vehicleList.get(i).calculateFuelEfficiency(distance, fuelPrice) + ", Start Engine:" + vehicleList.get(i).getStartType());
			}
		}
		if(!trucks) {
			System.out.println("There are no trucks in this list!");
		}
	}

	//Syd
	public void displayAllSUVInformation() {
		boolean suv = false;
		for(int i = 0; i < vehicleList.size(); i++){
			if(vehicleList.get(i) instanceof SUV) {
				suv=true;
				System.out.println(vehicleList.get(i).toString()+",Maintenance Cost: " +vehicleList.get(i).calculateMaintenanceCost(distance) + ", Fuel Efficiency:" + vehicleList.get(i).calculateFuelEfficiency(distance, fuelPrice) + ", Start Engine:" + vehicleList.get(i).getStartType());
			}
		}
		if(!suv) {
			System.out.println("There are no SUVs in this list!");
		}
	}

	//Syd
	public void displayAllMotorBikeInformation() {
		boolean motorbike = false;
		for(int i = 0; i < vehicleList.size(); i++){
			if(vehicleList.get(i) instanceof MotorBike) {
				motorbike=true;
				System.out.println(vehicleList.get(i).toString()+",Maintenance Cost: " +vehicleList.get(i).calculateMaintenanceCost(distance) + ", Fuel Efficiency:" + vehicleList.get(i).calculateFuelEfficiency(distance, fuelPrice) + ", Start Engine:" + vehicleList.get(i).getStartType());
			}
		}
		if(!motorbike) {
			System.out.println("There are no motor bikes in this list!");
		}
	}

	//Syd
	public void displayVehicleInformation(Vehicle v) {
		boolean vehicle = false;
		for(int i = 0; i < vehicleList.size(); i++){
			if(v.equals(vehicleList.get(i))) {
				vehicle=true;
				System.out.println(vehicleList.get(i).toString()+", Maintenance Cost: " +vehicleList.get(i).calculateMaintenanceCost(distance) + ", Fuel Efficiency:" + vehicleList.get(i).calculateFuelEfficiency(distance, fuelPrice) + ", Start Engine:" + vehicleList.get(i).getStartType());
			}
		}
		if(!vehicle) {
			System.out.println("Vehicle was not found in this list!");
		}
	}

	//Syd
	public void displayAllVehicleInformation() {
		if(vehicleList.isEmpty()){
			System.out.println("There are no vehicles in this list!");
		}
		for(int i =0; i<= vehicleList.size(); i++){
			System.out.println(vehicleList.get(i).toString()+", Maintenance Cost: " +vehicleList.get(i).calculateMaintenanceCost(distance) + ", Fuel Efficiency:" + vehicleList.get(i).calculateFuelEfficiency(distance, fuelPrice) + ", Start Engine:" + vehicleList.get(i).getStartType());
		}
	}

	//Ash
	public boolean removeVehicle(Vehicle vehicle) {
		try {
			for(int i = 0; i < vehicleList.size(); ++i) {
				if(this.vehicleList.get(i).equals(vehicle)) {
					vehicleList.remove(i);
				}
			}
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	//Ash
	public boolean addVehicle(Vehicle vehicle) {
		try {
			this.vehicleList.add(vehicle);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	//Ash
	public boolean saveVehicleList() {
		FileWriter fw;
		try {
			fw = new FileWriter(vehicleFilePath, false);
			BufferedWriter bwr = new BufferedWriter(fw);
			for (int i = 0; i < this.vehicleList.size(); i++) {
				bwr.write(this.vehicleList.get(i).getType() + "," + this.vehicleList.get(i).getBrand() + "," + this.vehicleList.get(i).getMake() + "," + 
						this.vehicleList.get(i).getModelYear() + "," + this.vehicleList.get(i).getPrice() + "," + this.vehicleList.get(i).getColor() + "," + 
						this.vehicleList.get(i).getFuelType() + "," + this.vehicleList.get(i).getMileage() + "," + this.vehicleList.get(i).getMass() + "," + 
						this.vehicleList.get(i).getCylinders() + "," + this.vehicleList.get(i).getGasTankCapacity() + "," + 
						this.vehicleList.get(i).getMileage() + "," + this.vehicleList.get(i).getStartType() + "\n");
			}
			bwr.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} 
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
			if(isVehicleType(vehicleList.get(i), clazz.getClass())) {
					count++;
			}
		}
		return count;
	}

	//David
	public Vehicle getVehicleWithHighestMaintenanceCost(double distance) {
		Random rand = new Random(); 
		double highestMaintenanceCost = 0.0;
		Vehicle highestMaintenanceCostVehicle = null;
	    for (int i = 0; i < this.vehicleList.size(); i++) {
	    	Vehicle currentVehicle = this.vehicleList.get(i);
	    	double maintenanceCostCurrent = currentVehicle.calculateMaintenanceCost(distance);
	    	if (maintenanceCostCurrent == highestMaintenanceCost) {
	    		int r = rand.nextInt(2);
	    		if (r == 0) {
	    			highestMaintenanceCost = maintenanceCostCurrent;
		    		highestMaintenanceCostVehicle = this.vehicleList.get(i);
	    		} else if (r == 1) {
	    			continue;
	    		}
	    	} else if (maintenanceCostCurrent > highestMaintenanceCost) {
	    		highestMaintenanceCost = maintenanceCostCurrent;
	    		highestMaintenanceCostVehicle = this.vehicleList.get(i);
	    	}
	    }
	    return highestMaintenanceCostVehicle;
	}

	//David
	public Vehicle getVehicleWithLowestMaintenanceCost(double distance) {
		Random rand = new Random(); 
		double lowestMaintenanceCost = 0.0;
		Vehicle lowestMaintenanceCostVehicle = null;
	    for (int i = 0; i < this.vehicleList.size(); i++) {
	    	Vehicle currentVehicle = this.vehicleList.get(i);
	    	double maintenanceCostCurrent = currentVehicle.calculateMaintenanceCost(distance);
	    	if (maintenanceCostCurrent == lowestMaintenanceCost) {
	    		int r = rand.nextInt(2);
	    		if (r == 0) {
	    			lowestMaintenanceCost = maintenanceCostCurrent;
	    			lowestMaintenanceCostVehicle = this.vehicleList.get(i);
	    		} else if (r == 1) {
	    			continue;
	    		}
	    	} else if (maintenanceCostCurrent < lowestMaintenanceCost) {
	    		lowestMaintenanceCost = maintenanceCostCurrent;
	    		lowestMaintenanceCostVehicle = this.vehicleList.get(i);
	    	}
	    }
	    return lowestMaintenanceCostVehicle;
	}

	//David
	public ArrayList<Vehicle> getVehicleWithHighestFuelEfficiency(double distance, double fuelPrice) {
		double highestFuelEfficiency = 0.0;
		ArrayList<Vehicle> highestFuelEfficientVehicles = new ArrayList<>();
	    for (int i = 0; i < this.vehicleList.size(); i++) {
	    	Vehicle currentVehicle = this.vehicleList.get(i);
	    	double fuelEfficiencyCurrent = currentVehicle.calculateFuelEfficiency(distance, fuelPrice);
	    	if (fuelEfficiencyCurrent > highestFuelEfficiency) {
	    		highestFuelEfficientVehicles.clear();
	    		highestFuelEfficientVehicles.add(currentVehicle);
	    		highestFuelEfficiency = fuelEfficiencyCurrent;
	    	} else if (fuelEfficiencyCurrent == highestFuelEfficiency) {
	    		highestFuelEfficientVehicles.add(currentVehicle);
	    	}
	    }
	    return highestFuelEfficientVehicles;
	}

	//David
	public ArrayList<Vehicle> getVehicleWithLowestFuelEfficiency(double distance, double fuelPrice) {
		double lowestFuelEfficiency = this.vehicleList.get(0).calculateFuelEfficiency(distance, fuelPrice);
		ArrayList<Vehicle> lowestFuelEfficientVehicles = new ArrayList<>();
	    for (int i = 0; i < this.vehicleList.size(); i++) {
	    	Vehicle currentVehicle = this.vehicleList.get(i);
	    	double fuelEfficiencyCurrent = currentVehicle.calculateFuelEfficiency(distance, fuelPrice);
	    	if (fuelEfficiencyCurrent < lowestFuelEfficiency) {
	    		lowestFuelEfficientVehicles.clear();
	    		lowestFuelEfficientVehicles.add(currentVehicle);
	    		lowestFuelEfficiency = fuelEfficiencyCurrent;
	    	} else if (fuelEfficiencyCurrent == lowestFuelEfficiency) {
	    		lowestFuelEfficientVehicles.add(currentVehicle);
	    	}
	    }
	    return lowestFuelEfficientVehicles;
	}

	//David
	public double getAverageFuelEfficiencyOfSUVs(double distance, double fuelPrice) {
		double averageFuelEfficiency = 0.0;
	    for (int i = 0; i < this.vehicleList.size(); i++) {
	    	Vehicle currentVehicle = this.vehicleList.get(i);
	    	if (isVehicleType(currentVehicle, SUV.class)) {
	    		double fuelEfficiencyCurrent = currentVehicle.calculateFuelEfficiency(distance, fuelPrice);
		    	averageFuelEfficiency += fuelEfficiencyCurrent;
		    	averageFuelEfficiency /= 2;
	    	}
	    }
	    return averageFuelEfficiency;
	}

}
