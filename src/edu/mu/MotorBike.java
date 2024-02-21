package edu.mu;

public class MotorBike extends Vehicle{
	public MotorBike() {
		
	}
	
	public MotorBike(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
		super.brand = brand;
		super.make = make;
		super.color = color;
		super.modelYear = modelYear;
		super.price = price;
		super.fuelType = fuelType;
		super.mileage = mileage;
		super.mass = mass;
		super.cylinders = cylinders;
		super.gasTankCapacity = gasTankCapacity;
		super.startType = startType;
	}
	
	public void copy(MotorBike mb) {
		this.brand = mb.brand;
		this.make = mb.make;
		this.color = mb.color;
		this.modelYear = mb.modelYear;
		this.price = mb.price;
		this.fuelType = mb.fuelType;
		this.mileage = mb.mileage;
		this.mass = mb.mass;
		this.cylinders = mb.cylinders;
		this.gasTankCapacity = mb.gasTankCapacity;
		this.startType = mb.startType;
	}
	
	
	@Override
	public double calculateMaintenanceCost(double distance) {
		double maintenanceCost;
		maintenanceCost=distance * mass
				* (2024-modelYear) *
				cylinders * 0.0002;
		return maintenanceCost;
	}

	@Override
	public double calculateFuelEfficiency(double distance, double fuelPrice) {
		double fuelEfficiency;
		fuelEfficiency = cylinders *
				gasTankCapacity * fuelPrice /
				distance * 0.001;
		return fuelEfficiency;
	}

	@Override
	public void startEngine() {
		System.out.println(this.startType);
		
	}

}
