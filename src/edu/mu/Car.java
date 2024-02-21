package edu.mu;

public class Car extends Vehicle{
	public Car() {
		
	}
	
	public Car(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
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
	
	public void copy(Car car1) {
		this.brand = car1.brand;
		this.make = car1.make;
		this.color = car1.color;
		this.modelYear = car1.modelYear;
		this.price = car1.price;
		this.fuelType = car1.fuelType;
		this.mileage = car1.mileage;
		this.mass = car1.mass;
		this.cylinders = car1.cylinders;
		this.gasTankCapacity = car1.gasTankCapacity;
		this.startType = car1.startType;
	}

	@Override
	public double calculateMaintenanceCost(double distance) {
		double maintenanceCost;
		maintenanceCost=distance * mass
				* (2024-modelYear) *
				cylinders * 0.0005;
		return maintenanceCost;
	}

	@Override
	public double calculateFuelEfficiency(double distance, double fuelPrice) {
		double fuelEfficiency;
		fuelEfficiency = cylinders *
				gasTankCapacity * fuelPrice /
				distance * 0.003;
		return fuelEfficiency;
	}

	@Override
	public void startEngine() {
		System.out.println(this.startType);
		
	}
	

}
